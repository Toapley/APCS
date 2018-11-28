import java.util.Scanner;

// Mr. Apley's version of RPS.
public class RPSInitial {
	
	public static void main(String[] args) {
		
		//Play rounds until we are done.		
		Scanner console = new Scanner(System.in);
		
		int roundNum = 1;	// Track how many rounds there are.
		while (true) {
			
			System.out.println("Beginning Round " + roundNum);			
			playRound(roundNum, console);
			
			if (!continuePlaying(console)) break;
							
			roundNum++;
			System.out.println("----------------------------");
		}
		
		System.out.println("Thank you for playing!");
		console.close();	// close scanner.

	}
	
	// Helper method to ask the user a question and verify the answer is ok.
	public static boolean continuePlaying(Scanner console) {
		
		/* Two parts here:
		 * 1) Keep prompting the user if they want to keep playing until they enter a yes or not
		 * 2) if they enter yes, return true, else false
		 * 
		 */

	}
	
	// Helper method to ask the user a question and verify the answer is ok.
	public static String promptUser(Scanner console) {
		
		/*
		 * Two parts here
		 * 1) Keep prompting the user to enter rock, paper, or scissors until they enter a valid choice
		 * 2) Return the valid choice.
		 */

	}
	
	// Helper method to have computer pick a choice
	public static String computerMove() {
		
		// Use math.random to return either Rock, Paper, or Scissors"
					
	}
	
	// Play a round of RPS
	public static void playRound(int roundNum, Scanner console) {
		
		int numMoves = 1;
		String winString="";
	
		while (true) {
			
			// Prompt user for choice and get the computer's move.
			String userChoice;
			String computerChoice;
		

			// Print it out...
			System.out.println("Computer picked " + computerChoice);
			
			// Check for a tie
			if (userChoice.equals(computerChoice.toUpperCase())) {
				System.out.println("No winner.  It's a tie.   Continuing round.");
				numMoves++;
			}
			else {	
				
				// Somebody won
				computerChoice = computerChoice.toUpperCase();
				
				// 3 ways we can win.
				if ( /* enter condition for the 3 ways in which you can win */ ) {
					winString = "Winner is you";
				} 
				else {
					winString = "Computer wins";
				}
				break;
									
			}				
			
		}
		
		// Lastly, print out the stats for the round.
		System.out.println("Round " + roundNum + "   " + winString + " # of Moves is " + numMoves);
		
	}

}
