package textExcel;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCell implements Cell 
{
	String dateString;
	
	public DateCell(String input)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = dateFormat.parse(input, new ParsePosition(0));
		dateString = dateFormat.format(date);
	}

	@Override
	public String abbreviatedCellText() 
	{
		return dateString;
	}

	@Override
	public String fullCellText() 
	{
		return dateString;
	}

}
