package calculator;

public class Calculator 
{
    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation..

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
        // TODO: Implement this function to produce the solution to the input.    
        
        return "";
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
