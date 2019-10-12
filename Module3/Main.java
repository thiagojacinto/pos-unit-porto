package activity09;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<String>();
		
		stringSet.add("Bernardo");
		stringSet.add("Elisabete");
		stringSet.add("Maria");
		stringSet.add("Elizabeth");
		stringSet.add("Clara");
		stringSet.add("Bernardo");
		stringSet.add("Elisabete");
		
		// Print this set
		System.out.println("Set of people: " + stringSet);
		
		Set<String> sortedStringSet = new TreeSet<String>(stringSet);
		System.out.println("Ordered set of people: " + sortedStringSet);
	}
}
