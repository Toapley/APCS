package textExcel;

public class SpreadsheetLocation implements Location 
{
	private int row;
	private int col;
	
	public SpreadsheetLocation(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	
	public SpreadsheetLocation(String cellString)
	{
		row = Integer.parseInt(cellString.substring(1)) - 1;
		col = cellString.toUpperCase().charAt(0) - 'A';
	}

	@Override
	public int getRow() 
	{
		return row;
	}

	@Override
	public int getCol() 
	{
		return col;
	}
	
	public String toString()
	{
	    return "" + (char) ('A' + col) + (row + 1);
	}
}
