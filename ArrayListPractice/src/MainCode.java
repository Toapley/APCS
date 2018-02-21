import java.util.*;

public class MainCode {

	public static void main(String[] args) {

		ArrayList<String> l;

		l = getList();

		option1(l);

		l = getList();

		option2(l);

		l = getList();

		option3(l);
		System.out.println(l);

		
	}

	// Increment by 2
	private static void option1(ArrayList<String> l) {

		System.out.println("Before: " + l);
		for (int i = 0; i < l.size(); i = i + 2) {
			String s = l.get(i);
			l.add(i + 1, s);
		}
		System.out.println("After: " + l);
	}

	// Iterate over the array list backwards.
	private static void option2(ArrayList<String> l) {

		System.out.println("Before: " + l);
		for (int i = l.size() - 1; i >= 0; i--) {
			String s = l.get(i);
			l.add(i, s);
		}
		System.out.println("After: " + l);
	}

	// Use 2 arrays.
	private static void option3(ArrayList<String> l) {

		System.out.println("Before: " + l);
		ArrayList<String> tmp = new ArrayList<>();
		
		for (String string : l) {
			tmp.add(string);
			tmp.add(string);
		}
		
		l = tmp;
		System.out.println("After: " + l);
	}

	private static ArrayList<String> getList() {

		ArrayList<String> l = new ArrayList<String>();
		l.add("Mom");
		l.add("Dad");
		l.add("Both");
		l.add("a");
		return l;
	}

}
