import java.util.*;

// Mr. Apley's version of RPS.
public class RPS {
	
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
		
		String input;
		while (true) {
			System.out.println("Would you like to continue playing?  Enter yes or no:");
			input = console.next().toUpperCase();
			
			if (input.equals("YES") || input.equals("NO")) break;
			
			System.out.println("DUDE!  Bad input.");				
		}
		
		return input.equals("YES");
	}
	
	// Helper method to ask the user a question and verify the answer is ok.
	public static String promptUser(Scanner console) {
		
		String input;
		while (true) {
			System.out.println("Enter rock, paper, or scissors");
			input = console.next().toUpperCase();
			
			if (input.equals("ROCK") || input.equals("PAPER") || input.equals("SCISSORS")) break;
			
			System.out.println("DUDE!  Bad input.");				
		}
		
		return input;
	}
	
	// Helper method to have computer pick a choice
	public static String computerMove() {
		
		int pick = (int) (Math.random() * 3);	// Will be int from [0..2]
		if (pick == 0)
			return "Rock";
		else if (pick == 1)
			return "Paper";
		else
			return "Scissors";
					
	}
	
	// Play a round of RPS
	public static void playRound(int roundNum, Scanner console) {
		
		int numMoves = 1;
		String winString="";
	
		while (true) {
			
			String userChoice = promptUser(console);
			String computerChoice = computerMove();
			
			System.out.println("Computer picked " + computerChoice);
			
			if (userChoice.equals(computerChoice.toUpperCase())) {
				System.out.println("No winner.  It's a tie.   Continuing round.");
				numMoves++;
			}
			else {	
				
				// Somebody won
				computerChoice = computerChoice.toUpperCase();
				
				// 3 ways we can win.
				if ( (userChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) ||
					 (userChoice.equals("PAPER") && computerChoice.equals("ROCK")) ||
					 (userChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) ) {
					winString = "Winner is you";
				} 
				else {
					winString = "Computer wins";
				}
				break;
									
			}				
			
		}
		
		// Print out the stats for the round.
		System.out.println("Round " + roundNum + "   " + winString + " # of Moves is " + numMoves);
		
	}

}
