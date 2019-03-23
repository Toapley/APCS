import java.util.*;

public class Hello {

	String mom;
	public static double bob() {
		return 5;
	}
	
	/*
	 * Base case - y = 0 -> 1
	 * Otherwise:
	 * 		if y is odd -> power(x^y) = x * p(x^y-1)
	 * 		if y is even -> power(x^y) = 2 * (p(x^y/2)
	 */
	static double power(double x, int y) {
		
		if (y == 0) return 1;
		
		double ret;
		if (y % 2 == 1)
			ret = x * power(x,y-1);
		else {
			double tmp = power(x,y/2);
			ret = tmp*tmp;
		}
		
		return ret;
		
	}
		
	public static void M1() {
		
		for(int i = 1; i<=10;i++) {
			System.out.println("Number is " + i);
			if (i==5) break;	// Break out of loop
		}
		
		int i = 1;
		while(true) {
			System.out.println("Number is " + i);
			if (i == 5) {
				break;				
			}
			else {
				i++;
			}
		}
		
	}
	public static void main(String[] args) {

	
		System.out.println(power(2,3));
		System.out.println(power(2,16));

	}

	
	
}
