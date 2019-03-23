
import java.util.*;

public class TestDeal {
	
	public static void printBinary(int n) {
	    if (n < 2) {
	        System.out.print(n);
	    } else {
	        printBinary(n / 2);
	        printBinary(n % 2);
	    }
	}

	public static void main(String[] args) {

		printBinary(3);
		
	}

	public static ArrayList<String> swapPairs(ArrayList<String> list) {

		for (int i = 1; 1 <= list.size() - 1; i += 2) {
			String save = list.get(i - 1);
			list.set(i - 1, list.get(i));
			list.set(i, save);
		}
		return list;
	}
}
