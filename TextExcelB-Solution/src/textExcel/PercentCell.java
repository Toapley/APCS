package textExcel;

public class PercentCell extends ValueCell
{
    public static PercentCell createPercentCell(String input)
    {
        if (input.charAt(input.length() - 1) != '%')
        {
            // Bad formatted string
            return null;
        }
        
        // Remove %, and convert from percent string to decimal string
        input = input.substring(0, input.length() - 1);
        double inputDouble = Double.parseDouble(input) / 100;
        input = "" + inputDouble;
    
        return new PercentCell(input);
    }
    
    public PercentCell(String input)
    {
        super(input);
    }

    public String abbreviatedCellText() 
    {
        String valueString = "" + ((int) (getDoubleValue() * 100)) + "%";
        
        return Spreadsheet.padOrTruncate(valueString);
    }
}
