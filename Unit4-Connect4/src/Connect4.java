import java.util.Arrays;

public class Connect4 {

	private char[][] grid;
	
	public Connect4() {
		grid = new char [6][7];
		
		for(int i= 0;i< grid.length;i++) {
			for(int j = 0; j<grid[i].length;j++) {
				grid[i][j] = '-';
			}
		}
		
	}
	
	/**
	 * return true if valid move, otherwise false.
	 * @param column
	 * @param symbol
	 * @return
	 */
	public boolean insert(int column, char symbol) {
		
		if (column < 0 || column > 6) return false;
		
		// Error case #1 (no room)
		if (grid[0][column] != '-') return false;
		
		// Otherwise, place in bottom-most column
		int i = grid.length-1;
		while(grid[i][column] != '-') {
			i--;
		}
		grid[i][column] = symbol;
		return true;
		
	}
	
	/**
	 * return true if symbol has one.
	 * @param symbol
	 * @return
	 */
	public boolean hasWon(char symbol) {
		// Check for rows.
		if (checkRows(symbol)) return true;
		if (checkCols(symbol)) return true;
		// Check for columns
		// Check up diag
		// Check down diag
		return false;
	}
	
	/*
	private boolean checkRows(char symbol) {

		// For each row...
		//System.out.println(grid.length);
		for (int i = 0; i<grid.length;i++) {
		
			//System.out.println(Arrays.toString(grid[i]));
			// Check for 4 in a row...
			for (int j = 0; j<grid[i].length-3;j++) {
				
				if (grid[i][j] == symbol && grid[i][j+1] == symbol && 
						grid[i][j+2] == symbol && grid[i][j+3] == symbol) {
					return true;
				}
			}
			
		}
		return false;
	}
	*/
	
	private boolean checkRows(char symbol) {

		// For each row...
		for (int i = 0; i<grid.length;i++) {
	
			for (int j = 0; j<grid[i].length;j++) {
				
				// Check for runs
				if(runLength(j, grid[i],symbol) >= 4) return true;
				
			}
			
		}
		return false;
	}

	private boolean checkUpDiag(char symbol) {

		
		// For each row...
		for (int i = 0; i<grid.length;i++) {
	
			for (int j = 0; j<grid[i].length;j++) {
				
				// Check for runs
				if(runLength(j, grid[i],symbol) >= 4) return true;
				
			}
			
		}
		return false;
	}

	
	private int runLength(int startIndex, char[] row, char symbol) {
		
		int i = startIndex + 1;
		int count = 1;
		while (i < row.length && row[i] == symbol) {
			count++;
			i++;
		}
		return count;
		
	}
	
	
	
	private boolean checkCols(char symbol) {

		// For each column
		for (int i = 0; i<grid[0].length;i++) {
		
			// Check for 4 in a row...
			for (int j = 0; j<grid.length-3;j++) {
				
				if (grid[j][i] == symbol && grid[j+1][i] == symbol && 
						grid[j+2][i] == symbol && grid[j+3][i] == symbol) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	// How many in a row?
	
	
	public String toString() {
		String s="Connect 4 Grid:\n";
		s += "0 1 2 3 4 5 6\n";
		for(int i= 0;i< grid.length;i++) {
			for(int j = 0; j<grid[i].length;j++) {
				s += grid[i][j] + " " ;
			}
			s += "\n";
		}
		return s;
	}
}
