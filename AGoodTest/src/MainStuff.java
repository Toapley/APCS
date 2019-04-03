
import java.util.*;

public class MainStuff {
	
	public static void printBinary(int n) {
	    if (n < 2) {
	        System.out.print(n);
	    } else {
	        printBinary(n / 2);
	        printBinary(n % 2);
	    }
	}

	public static void main(String[] args) {

		Employee e = new Employee("John", 123, 50000, 1000);
		Employee c = new Consultant("Steve", 456, 90000, 2000);

		c.increaseBonus(100);
		
	}


}
