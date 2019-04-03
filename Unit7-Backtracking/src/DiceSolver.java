import java.util.ArrayList;
import java.util.List;

public class DiceSolver {

	//Add up all the items in the list
	private static int sumupList(List<Integer> l) {
		int sum = 0;
		for(int i : l) sum+=i;
		return sum;	
	}
	
	/*** 
	 * @param numDice	- # of dice to use.
	 * @param desiredSum - What the target sume is.
	 * @return the total number of solutions found...
	 */
	public static int dice(int numDice, int desiredSum) {
			
		List<Integer> listOfDice = new ArrayList<Integer>();
		return dice(numDice, desiredSum, listOfDice,0);

	}

	/***
	 * 
	 * @param numDice - # of dice to use - This should never change.
	 * @param desiredSum - What the target sum is - This should never change
	 * @param currentSum - What the current sum is 
	 * @param listOfDice - Dice we're trying
	 * @param solutionsFound - current count of solutions
	 * @return
	 */
	private static int dice(int numDice, int desiredSum, List<Integer> listOfDice, int solutionsFound) {

		/*
		 * Your solution should be something like the following:
		 * 
		 * if (this is a solution) {
		 * 	report it (print out the arraylist)
		 *  add one to current count and return the answer
		 * }
		 * else if (this is clearly not a solution) {
		 *    return the current count
		 * } else {
		 *  	recursive case - try again with *all* possible dice values.
		 *  } 
		 *  
		 */
		
		int currentSum = sumupList(listOfDice);
		
		if (currentSum == desiredSum && listOfDice.size() == numDice) {
			System.out.println("A solution: " + listOfDice.toString());
			return solutionsFound+1;
		} else if (listOfDice.size() > numDice || currentSum > desiredSum) {
			return solutionsFound; 
		} else {	//General
			for (int i = 1; i <= 6; i++) {
				listOfDice.add(i);	//Try this dice
				solutionsFound = dice(numDice, desiredSum,listOfDice,solutionsFound); // See if it works
				listOfDice.remove(listOfDice.size() - 1 );	// Remove this dice to try another option			
			}
		}
		
		return solutionsFound;

	
	}
	

	public static void main(String[] args) {

		System.out.println(dice(3,7));

	}
}
