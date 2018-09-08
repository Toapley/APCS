import java.util.*;

public class mainCode {

	public static void main(String[] args) {
						
		String[] period1 = {"Trixie", "Susan", "Annika", "Connor", "Hayden", "James", "John", "Jenna", "Shira", "Jarec", "Gavin", "Maggie", "Alyssa", "Harris", "Garrett", "Faraz", "Pranathi", "Brandon", "Ajay", "Casey", "Kevin", "Fiona"};
		String[] period2 = {"Bryce", "Xavier", "Andreea", "Mark", "Tianyi", "Nathan", "Sean", "Ivan", "Sanjana", "Melvin", "Spencer"};
		String[] period3 = {"Anna", "Dylan", "Jake", "Jaron","Cate","Landon","Koji","Adnan","Michaela","James","Andrey","Trotsky","Sim","Joshua","Ben","Oliver","Morgan","Grant","Kokoa","Calin","Simon","Daniel","David","Cameron","Drew","Caden","Oscar","Grayson","Afrah"};
		String[] period4 = {"Aidan A", "Tyler", "Terence", "Sadie", "Adrian", "Mitchell", "Natalie", "Taylor", "Thomas", "Arya", "Landon", "Ann", "Luc", "Dovovan H", "Kenny", "Julian", "Sonya", "Kelson", "Nikita", "Emily", "Donovan L", "Mauricio", "Dora", "Danny", "Aiden S", "Harrison", "Gloria", "Indigo", "Kiara", "Amara"};
		sortClass(period3,2);	
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
