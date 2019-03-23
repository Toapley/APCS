package textExcel;

public class TextCell implements Cell 
{
	private String input; // Example: "Hello"
	
	public TextCell(String input)
	{
		this.input = input;
	}

	@Override
	public String abbreviatedCellText() 
	{
		// Remove quotes
		String quotesRemoved = input.substring(1, input.length() - 1);
		
		// Pad or truncate
		return Spreadsheet.padOrTruncate(quotesRemoved);
	}

	@Override
	public String fullCellText() 
	{
		return input;
	}
}
