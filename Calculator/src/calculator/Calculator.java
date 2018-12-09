package calculator;
import java.util.*;

public class Calculator 
{
    public static void main(String[] args) 
    {

    	Scanner console = new Scanner(System.in);
    	while (true) {
    		System.out.println("Enter an expression");
    		String s = console.nextLine();
    		
    		if (s.toUpperCase().equals("Q")) break;
    		
    		System.out.println(produceAnswer(s));
    	}
    
    	console.close();
    	System.out.println("all done");
    }
    
    public  static String getFirstWord(String input) {
    	
    	int i = input.indexOf(' ');    	
    	if (i == -1) return input;
    	return input.substring(0,i);
    	
    	
    }
    
    public  static String skipFirstWord(String input) {    	
    	int i = input.indexOf(' ');    	
    	if (i == -1) return "";
    	return input.substring(i+1);
    }
       
    /** 
     *    ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code.
     *  
     *  This function takes a String 'input' and produces the result. The input is a string that needs to be evaluated.  
     *  For your program, this will be the user input. For example, 
     *          input ==> "1 + 3"
     *  the function should return the result of the expression after it has been calculated:
     *          return ==> "4"
     *  If there is an error in the user input, the appropriate error message is returned.
     *           
     * @param input     the arithmetic expression to be evaluated
     * @return          the result of the arithmetic expression or an error message
     */
    public static String produceAnswer(String input)
    {
    	
    	String operand1, operand2, operator;
    	
    	input = input.trim();  
    	if (input.length() == 0 ) return "";
    	
    	// Get first token    	
    	operand1 = getFirstWord(input);    	
    	if (!isValidNumber(operand1)) return "<ERROR> Invalid value: " + operand1;
    	
    	// Now loop and get next two tokens and condense
    	while(input.length() != 0) {
    		
        	input = skipFirstWord(input);        	
        	if (input.length() == 0) return operand1; // We're done
        	
        	operator = getFirstWord(input);  // There should be an operator here
        	if(!isValidOperator(operator)) return "<ERROR> Invalid operator encountered: " + operator;
        		
        	input = skipFirstWord(input); // There should be an operand here.
        	if (input.length() == 0) return "<ERROR> Invalid expression format.";
        	        	
        	operand2 = getFirstWord(input);    	
        	if (!isValidNumber(operand2)) return "<ERROR> Invalid value: " + operand2;    	
        	   
        	// Condense everything
        	operand1 = computeValue(operand1, operator, operand2);  
        	if (operand1.indexOf("<ERROR>") > -1) return operand1;
    		
    	}
    	
    	return operand1;

    }

    
    private static boolean isValidOperator(String operator) {
		if (operator.equals("+"))
			return true;
		else if (operator.equals("-"))
			return true;
		else if (operator.equals("*"))
			return true;
		else if (operator.equals("/"))
			return true;
		else 
			return false;
    }
    
    private static String computeValue(String operand1, String operator, String operand2) {
    	int op1 = Integer.parseInt(operand1);
    	int op2 = Integer.parseInt(operand2);
    	
    	int ret;
    	
		if (operator.equals("+"))
			ret = op1 + op2;
		else if (operator.equals("-"))
			ret = op1 - op2;
		else if (operator.equals("*"))
			ret = op1 * op2;
		else if (operator.equals("/"))
			if (op2 == 0) 
				return "<ERROR> Cannot divide by zero.";
			else
				ret = op1 / op2;				
		else 
			return "<ERROR> Invalid operator encountered: " + operator;
		
		
		
		return Integer.toString(ret);
				
	}

	/**
     * You may find this function useful in determining if a string value is a valid integer or not. If you call Integer.parseInt()
     * on a string that is not a valid integer, a NumberFormatException will be thrown and your program will terminate. In order to 
     * not have your program terminate on invalid integers, call this function to determine if the string is a valid integer before 
     * parsing it as an integer value.  
     * 
     * @param strVal    the string expression to test to see if it's an integer
     * @return          true if string expression is an integer, false otherwise
     */
    public static boolean isValidNumber(String strVal)
    {
        try
        {
            Integer.parseInt(strVal);             
        }
        catch (NumberFormatException e) 
        {
            return false;
        }
        return true;        
    }
    
    /**
     * You may find the gcd() and lcm() functions helpful if you decide to do the fraction values extra credit work. 
     * These functions implement Euclid's algorithm for finding GCD (greatest common divisor) and LCM (least common multiple).
     *  
     * @param a     first number
     * @param b     second number
     * @return      greatest common divisor or least common multiple of a and b
     */   
    public static int gcd(int a, int b)
    {
        a = Math.abs(a); 
        b = Math.abs(b); 
        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b)
    {
        a = Math.abs(a); 
        b = Math.abs(b); 
        return a * (b / gcd(a, b));
    }   
    
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
