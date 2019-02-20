import java.util.*;

public class mainCode {

	public static void main(String[] args) {
						
		String[] period1 = {"Trixie", "Susan", "Annika", "Connor", "Hayden", "James", "John", "Jenna", "Shira", "Jarec", "Gavin", "Maggie", "Alyssa", "Harris", "Garrett", "Faraz", "Pranathi", "Brandon", "Ajay", "Casey", "Fiona", "Tianyi", "Ellen"};
		String[] period2 = {"Bryce", "Xavier", "Andreea", "Mark", "Nathan", "Sean", "Ivan", "Sanjana", "Melvin", "Spencer", "Tyler"};
		// String[] period3 = {"Anna", "Dylan", "Jake", "Jaron","Cate","Landon","Koji","Michaela","James","Andrey","Trotsky","Sim","Joshua","Oliver","Morgan","Grant","Kokoa","Calin","Simon","Daniel","David","Cameron","Drew","Caden","Oscar","Grayson","Afrah", "Nate", "Sophia"};
		String[] period4 = {"Brin","Conner","Jacob","Luc","Ryan","Julian","Shreyas","Ethan K","Nikita","Angela","Michael","Ahava","Laine","Erik","Nico","Thomas","Christian","Gloria","Indigo","Owen","Joseph","Javeria","Riley","Inayah","Ethan H","Evelyn","Kayla","Joshua","Sufyan","Charles"};
		sortClass(period4,1);	
		
		
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
		
		System.out.println("There were " + roster.length + " students:");
		
		// Print out the groups
		int i=1;
		for (ArrayList<String>  grp : l) {
			System.out.println( grp.toString());
			//System.out.println("Group " + i + ": " + grp.toString());
			i++;
		}
				
		
	}

}
