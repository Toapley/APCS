package textExcel;

import java.io.File;
import java.io.FileNotFoundException;
// Update this file with your own code.
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Spreadsheet implements Grid
{
    private Cell[][] cells;

    private String[] history;
    private int numCommandsInHistory;

    public Spreadsheet()
    {		
        cells = new Cell[getRows()][getCols()];

        for (int i = 0; i < getRows(); i++)
        {
            for (int j = 0; j < getCols(); j++)
            {
                cells[i][j] = new EmptyCell();
            }
        }
    }

    @Override
    public String processCommand(String command)
    {
        if (command.startsWith("history"))
        {
            return processHistoryCommand(command);
        }
        else
        {
            addCommandToHistory(command);

            if (command.equalsIgnoreCase(""))
            {
                return "";
            }
            else if (command.equalsIgnoreCase("clear")) // Example: clear
            {
                clearSpreadsheet();

                return getGridText();
            }
            else if (command.length() > 5 && command.substring(0, 5).equalsIgnoreCase("clear")) // Example: clear A1
            {
                String cellString = command.substring(6);
                SpreadsheetLocation loc = new SpreadsheetLocation(cellString);

                cells[loc.getRow()][loc.getCol()] = new EmptyCell();
                return getGridText();
            }
            else if (command.length() > 4 && command.substring(0, 4).equalsIgnoreCase("open"))
            {
                String filename = getFilenameFromFileCommand(command);
                if (filename == null)
                {
                    return "ERROR: Expected filename after command";
                }

                openFile(filename);
                return getGridText();
            }
            else if (command.length() > 4 && command.substring(0, 4).equalsIgnoreCase("save"))
            {
                String filename = getFilenameFromFileCommand(command);
                if (filename == null)
                {
                    return "ERROR: Expected filename after command";
                }

                saveFile(filename);
                return getGridText();
            }
            else if (!command.contains(" ")) // Example: A1
            {
                String cellString = command;
                SpreadsheetLocation loc = new SpreadsheetLocation(cellString);

                return cells[loc.getRow()][loc.getCol()].fullCellText();
            }
            else // Cell assignment
            {
                String cellString = command.substring(0, command.indexOf(" "));
                String value = command.substring(command.indexOf("=") + 2);
                SpreadsheetLocation loc = new SpreadsheetLocation(cellString);

                if (value.startsWith("\"")) // Example: A1 = "Hello"
                {
                    cells[loc.getRow()][loc.getCol()] = new TextCell(value);
                }
                else if (value.startsWith("(")) // Example: A1 = ( 5 + 3.2 / 2 )
                {
                    cells[loc.getRow()][loc.getCol()] = new FormulaCell(value, this);				
                }
                else if (value.contains("/")) // Example: A1 = 1/1/2005
                {
                    cells[loc.getRow()][loc.getCol()] = new DateCell(value);
                }
                else if (value.contains("%")) // Example: A1 = 2.8%
                {
                    PercentCell percentCell = PercentCell.createPercentCell(value);
                    if (percentCell == null)
                    {
                        return "ERROR: Invalid format detected.  % sign should only be at the end: '" + command + "'";
                    }

                    cells[loc.getRow()][loc.getCol()] = percentCell;
                }
                else // Example: A1 = 5.2
                {
                    cells[loc.getRow()][loc.getCol()] = new ValueCell(value);
                }

                return getGridText();
            }
        }
    }

    private String processHistoryCommand(String command)
    {		
        String output = "";
        String[] parts = command.split(" ");
        if (parts[1].equals("start"))
        {
            int historySize = Integer.parseInt(parts[2]);

            history = new String[historySize];	
            numCommandsInHistory = 0;		
        }
        else if (parts[1].equals("stop"))
        {
            history = null;
            numCommandsInHistory = 0;
        }
        else if (parts[1].equals("display"))
        {
            for (int commandIndex = numCommandsInHistory - 1; commandIndex >= 0; commandIndex--)
            {
                output += history[commandIndex];

                if (commandIndex > 0)
                {
                    output += "\n";
                }
            }
        }
        else if (parts[1].equals("clear"))
        {
            int numToClear = Integer.parseInt(parts[2]);
            String[] newHistory = new String[history.length];

            for (int commandIndex = numCommandsInHistory - 1; commandIndex >= numToClear; commandIndex--)
            {
                newHistory[commandIndex - numToClear] = history[commandIndex];
            }

            history = newHistory;
            numCommandsInHistory -= numToClear;
            if (numCommandsInHistory < 0)
            {
                numCommandsInHistory = 0;
            }
        }

        return output;
    }

    private void addCommandToHistory(String command)
    {
        if (history != null)
        {
            if (numCommandsInHistory == history.length)
            {
                processHistoryCommand("history clear 1");
            }

            history[numCommandsInHistory++] = command;
        }
    }

    @Override
    public int getRows()
    {
        return 20;
    }

    @Override
    public int getCols()
    {
        return 12;
    }

    @Override
    public Cell getCell(Location loc)
    {
        return cells[loc.getRow()][loc.getCol()];
    }

    @Override
    public String getGridText()
    {
        String retVal = "";

        // First line
        retVal += "   |";
        for (int col = 0; col < getCols(); col++)
        {
            retVal += ((char)('A' + col));
            retVal += "         |";
        }
        retVal += "\n";

        // Each row
        for (int row = 0; row < getRows(); row++)
        {
            // Row number
            int rowNumber = row + 1;
            retVal += rowNumber;
            if (rowNumber < 10)
                retVal += "  |";
            else
                retVal += " |";

            // Each column
            for (int col = 0; col < getCols(); col++)
            {
                retVal += cells[row][col].abbreviatedCellText();
                retVal += "|";
            }

            retVal += "\n";
        }

        return retVal;
    }

    private void clearSpreadsheet()
    {
        for (int i = 0; i < getRows(); i++)
        {
            for (int j = 0; j < getCols(); j++)
            {
                cells[i][j] = new EmptyCell();
            }
        }
    }


    private void openFile(String filename)
    {
        // Clear out spreadsheet first
        clearSpreadsheet();

        File myFile = new File(filename);
        Scanner fileReader;
        try
        {
            fileReader = new Scanner(myFile);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not find file '" + filename + "'");
            return;
        }


        while(fileReader.hasNextLine())
        {
            String line = fileReader.nextLine();

            // A1
            int iComma1 = line.indexOf(",");
            String cellID = line.substring(0, iComma1);
            SpreadsheetLocation loc = new SpreadsheetLocation(cellID);
            int row = loc.getRow();
            int col = loc.getCol();

            // ValueCell
            int iComma2 = line.indexOf(",", iComma1 + 1);
            String cellClass = line.substring(iComma1 + 1, iComma2);

            // 3.14
            String cellText = line.substring(iComma2 + 1);

            if (cellClass.equals("PercentCell"))
            {
                double value = Double.parseDouble(cellText) * 100;
                cells[row][col] = PercentCell.createPercentCell(value + "%");
            }
            else if (cellClass.equals("FormulaCell"))
            {
                cells[row][col] = new FormulaCell(cellText, this);
            }
            else if (cellClass.equals("ValueCell"))
            {
                cells[row][col] = new ValueCell(cellText);
            }
            else if (cellClass.equals("TextCell"))
            {
                cells[row][col] = new TextCell(cellText);
            }
        }

        fileReader.close();
    }

    private void saveFile(String filename)
    {
        PrintWriter file;
        try
        {
            file = new PrintWriter(filename);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not find file '" + filename + "'");
            return;
        }

        String out = "";
        for (int row=0; row < cells.length; row++)
        {
            for (int col=0; col < cells[row].length; col++)
            {
                Cell cell = cells[row][col];
                if (cell != null)
                {
                    String cellID = (new SpreadsheetLocation(row, col)).toString();
                    String cellClass = "ERROR: Unknown cell class";
                    if (cell instanceof PercentCell)
                    {
                        cellClass = "PercentCell";
                    }
                    else if (cell instanceof FormulaCell)
                    {
                        cellClass = "FormulaCell";
                    }
                    else if (cell instanceof ValueCell)
                    {
                        cellClass = "ValueCell";
                    }
                    else if (cell instanceof TextCell)
                    {
                        cellClass = "TextCell";
                    }
                    else if (cell instanceof EmptyCell)
                    {
                        // Intentionally write nothing
                        cellClass = null;
                    }
                    if (cellClass != null)
                    {
                        //file.println(cellID + "," + cellClass + "," + cell.fullCellText());
                        out += cellID + "," + cellClass + "," + cell.fullCellText() + "\n";
                    }
                }
            }
        }
        file.print(out);
        file.close();
    }

    public static String padOrTruncate(String input)
    {		
        if (input.length() < 10)
        {
            String padded = input;
            int numSpacesRequired = 10 - input.length();

            for (int i = 0; i < numSpacesRequired; i++)
            {
                padded += " ";
            }

            return padded;
        }
        else if (input.length() > 10)
        {
            return input.substring(0, 10);
        }
        else
        {
            return input;
        }
    }

    private static String getFilenameFromFileCommand(String command)
    {
        int iSpace = command.indexOf(" ");
        if (iSpace == -1 || iSpace == command.length() - 1)
        {
            return null;
        }

        return command.substring(iSpace + 1);
    }
}