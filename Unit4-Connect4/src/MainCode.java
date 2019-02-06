import java.util.Scanner;

public class MainCode {


	
	public static void main(String[] args) {


		//Initialize Grid
		Connect4 grid = new Connect4();
		System.out.println(grid);
		
		Scanner console = new Scanner(System.in);
		
		//Ask for users
		char p1 = '*';
		char p2 = '#';
		int move;
		
		while (true) {
			
			if (doMove(console, "Player 1", p1,grid)) break;
			if (doMove(console, "Player 2", p2,grid)) break;
			
			
		}
		

		
	}
	
	private static boolean doMove(Scanner console, String player, char symbol, Connect4 grid) {
		
		System.out.print(player + " move? (0-6):");
		int move;
		move = console.nextInt();
		
		// Place move
		while (!grid.insert(move, symbol)) {
			System.out.println("Invalid move (0-6): ");
			move = console.nextInt();
		}
		
		System.out.println(grid);
		
		if (grid.hasWon(symbol)) {
			System.out.println(player + " wins!");
			return true;
		}

		return false;
	}
	


}
