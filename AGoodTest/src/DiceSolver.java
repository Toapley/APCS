import java.util.*;

public class DiceSolver {

	/*** 
	 * @param numDice	- # of dice to use.
	 * @param sumTotal - What the target sume is.
	 * @return the total number of solutions found...
	 */
	public static int dice(int numDice, int sumTotal) {
			
		List<Integer> l = new ArrayList<Integer>();
		return dice(numDice, sumTotal, 0, l,0);

	}

	/***
	 * 
	 * @param numDice - # of dice to use - This should never change.
	 * @param sumTotal - What the target sum is - This should never change
	 * @param currentSum - What teh current sum is 
	 * @param list
	 * @param currentCount
	 * @return
	 */
	private static int dice(int numDice, int sumTotal, int currentSum, List<Integer> list, int currentCount) {

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
		 *  
		 *  } 
		 *  
		 */
		if (currentSum == sumTotal && list.size() == numDice) {
			System.out.println("A solution: " + list.toString());
			return currentCount+1;
		} else if (list.size() > numDice || currentSum > sumTotal) {
			return currentCount; // no solution
		} else {	//recurse
			for (int i = 1; i <= 6; i++) {
			
				list.add(i);
				currentCount = dice(numDice, sumTotal, currentSum + i,list,currentCount);
				list.remove(list.size() -1);				
						
			}
			
		}
		
		return currentCount;

	
	}

	public static void main(String[] args) {

		System.out.println(dice(6,25));

	}
}
