package activity12;

public class StringsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "mariaeduarda";
//		int size;
		
//		size = name.length();
//		System.out.printf("String: %s / Size = %d ",name, size);
//		
//		// Substrings
//		String subName = name.substring(3,7);
//		System.out.printf("Sub-string: %s",subName);
		
		// Equivalence
					// - Method 1
//		if (name.equals("Victor Hugo")) {
//			System.out.println("Equals!");
//		} else {
//			System.out.println("Differents!");
//		}
//		// Equivalence - Method 2
//		if (name == "Victor Hugo") {
//			System.out.println("Equals!");
//		} else {
//			System.out.println("Differents!");
//		}
//		// Equivalence - Method 3 -- Ignoring case sensitive
//		if ("Victor hugO".equalsIgnoreCase("Victor Hugo") ) {
//			System.out.println("Equals!");
//		} else {
//			System.out.println("Differents!");
//		}
//		
//		// Contains method
//		if (name.contains("aria")) {
//			System.out.println("It contains!");
//		} else {
//			System.out.println("Not contained inside!");
//		}
		
		// StartsWith
		
//		  String name1 = "Victor Hugo Benstrass"; String name2 = "viCtor";
//		  
//		  if (name1.toLowerCase().startsWith(name2.toLowerCase())) {
//		  System.out.println("True, the name starts with it."); } else {
//		  System.out.println("False"); }
//		 
		
		// Replace & First (the first that finds)
//		System.out.println(name.replace("a", "u"));
//		System.out.println(name);
//		System.out.println(name.replaceFirst("a", "i"));
		
		// int to String, using valueOf
//		int number = 234;
//		System.out.println(Integer.valueOf(number) + 234);
//		// then converting
//		System.out.println(String.valueOf(number) + 567);
		
		// indexOf
		
//		System.out.println(name.indexOf("a"));
		
		
		// Trim
		String name3 = "             ok my friend       ";
		System.out.println(name3.trim());
		System.out.println(name3.replace(" ", ""));
//		System.out.println(name3);
	}

}
