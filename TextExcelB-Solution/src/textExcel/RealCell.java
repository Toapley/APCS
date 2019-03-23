package textExcel;

public abstract class RealCell implements Cell 
{
	private String input;
	
	public RealCell(String input)
	{
		this.input = input;
	}
	
	public abstract double getDoubleValue();
	
	@Override
	public String abbreviatedCellText() 
	{
		String valueString = "" + getDoubleValue();
		
		return Spreadsheet.padOrTruncate(valueString);
	}

	@Override
	public String fullCellText() 
	{
		return input;
	}
}
