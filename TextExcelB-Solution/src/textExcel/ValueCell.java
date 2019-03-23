package textExcel;

public class ValueCell extends RealCell 
{
	public ValueCell(String input)
	{
		super(input);
	}

	@Override
	public double getDoubleValue() 
	{
		String input = fullCellText();
		
		return Double.parseDouble(input);
	}
}
