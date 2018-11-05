import java.util.*;

public class Hello {

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

		
		M1();
		
		
		
		Scanner console = new Scanner(System.in);
		int sum = 0;

		while (true) {
			
			//Do a post
		    System.out.print("Type a word (or \"quit\" to exit): ");
		    String response = console.next();
		    
		    if (response.equals("quit")) break; 					
		    sum += response.length();    // moved to top of loop

		}

		System.out.println("You typed a total of " + sum + " characters.");

	}

	
	
}
