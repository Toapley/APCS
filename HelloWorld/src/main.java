import java.util.*;

public class main {

	public static void main(String[] args) {

	       ArrayList<String> l = new ArrayList<String>();
	       l.add("Mom");
	       l.add("Dad");
	       l.add("bo");
	       System.out.println(l);
	       
	       
	       for(int i = 0; i < l.size(); i++) {
	              String s = l.get(i);
	              l.add(i + 1, s);
	              System.out.println(l);
	       } 
	       
	       /*
	       for (int i = 0; i< l.size(); i++) {
	              if (l.get(i).length() % 2 != 0 ) {
	                    l.remove(i);
	                    i--;
	              }
	       }
	       */
	       
	       System.out.println(l);

	}

}
