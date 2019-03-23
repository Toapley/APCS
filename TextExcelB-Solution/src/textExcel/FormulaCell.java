package textExcel;

import java.security.InvalidParameterException;

public class FormulaCell extends RealCell 
{
	private Spreadsheet sheet;
	
	public FormulaCell(String input, Spreadsheet sheet)
	{
		super(input);
		this.sheet = sheet;
	}

	@Override
	public double getDoubleValue() 
	{
		String formula = fullCellText();
		String[] args = formula.split(" ");
		
		if (args[1].equalsIgnoreCase("sum") || args[1].equalsIgnoreCase("avg"))
			return getMethodFormulaResult(args);				
		else
			return getNormalFormulaResult(args);
	}

	private double getNormalFormulaResult(String[] args) 
	{
		double result = getOperandValue(args[1]);
		for (int i = 3; i < args.length - 1; i += 2)
		{
			String operator = args[i-1];
			double operandValue = getOperandValue(args[i]);
			
			if (operator.equals("+"))
				result += operandValue;
			else if (operator.equals("-"))
				result -= operandValue;
			else if (operator.equals("*"))
				result *= operandValue;
			else if (operator.equals("/"))
				result /= operandValue;
		}
		
		return result;
	}

	private double getMethodFormulaResult(String[] args) 
	{
	    //throw new InvalidParameterException();
	    
		double result = 0.0;
		
		String firstCellString = args[2].substring(0, args[2].indexOf("-"));
		String lastCellString = args[2].substring(args[2].indexOf("-") + 1);
		
		SpreadsheetLocation firstLoc = new SpreadsheetLocation(firstCellString);
		SpreadsheetLocation lastLoc = new SpreadsheetLocation(lastCellString);
		
		int cellCount = 0;
		for (int row = firstLoc.getRow(); row <= lastLoc.getRow(); row++)
		{
			for (int col = firstLoc.getCol(); col <= lastLoc.getCol(); col++)
			{
				SpreadsheetLocation loc = new SpreadsheetLocation(row, col);
				RealCell realCell = (RealCell)sheet.getCell(loc);
				result += realCell.getDoubleValue();
				
				cellCount++;
			}
		}
		
		if (args[1].equalsIgnoreCase("avg"))
		{
			result /= cellCount;
		}
		
		return result;
	}
	
	public double getOperandValue(String operand)
	{
		if (Character.isLetter(operand.charAt(0)))
		{
		    //throw new InvalidParameterException();
		    
			SpreadsheetLocation loc = new SpreadsheetLocation(operand);
			RealCell realCell = (RealCell)sheet.getCell(loc);
			return realCell.getDoubleValue();
		}
		else
		{
			return Double.parseDouble(operand);
		}
	}
}