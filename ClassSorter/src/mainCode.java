import java.util.*;

public class mainCode {

	public static void main(String[] args) {
						
		String[] period1 = {"Deepti", "Anas", "Isaac", "Riley","Abd","Maja","Enoch","Arthur","Sage","Egor","Eric","Nate","Max","Alek","Nithish","Nick","Omri","Thomas","Rahul","Amir"};
		String[] period2 = {"Vivian","Ariana", "Bradley","Monty","Zach","Wyatt","David", "Eugene"};
		String[] period3 = {"Austin", "Regan", "Callie", "Alexander", "Keemia", "Drew", "Cameron", "Matthew", "Momo", "Danna", "Karina", "Mohamed", "Zach", "Douglas", "Jonathan","Tyler","Kayla","Alexis","Shane","Alex"};
		sortClass(period1,3);	
	}
	
	// Given a list of people in the class and the size of groups desired
	// will print out a random set of groups.
	public static void sortClass(String[] roster, int size) {
		
		int numGroups = roster.length / size;
		if (roster.length % size != 0) numGroups++;
		
		ArrayList<ArrayList<String>> l = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> students = new ArrayList<>();
		for (int i = 0; i < roster.length; i++) {
			students.add(roster[i]);
		}
		
		// Create my groups.
		for(int i=0; i< numGroups;i++) {
			l.add(new ArrayList<String>());
		}
		
		// Add students to each group
		for (ArrayList<String>  grp : l) {

			
			for (int i = 1; i <= size; i++) {
				if (students.size() > 0) {
					int r = (int) (Math.random() * students.size());
					grp.add(students.remove(r));
				}
								
			}
			
		}
		
		// Print out the groups
		int i=1;
		for (ArrayList<String>  grp : l) {
			System.out.println("Group " + i + ": " + grp.toString());
			i++;
		}
				
		
	}

}
