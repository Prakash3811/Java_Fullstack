package Day4;

public class get_the_character_at_the_given_index_within_the_String {
	public static void main(String[] args) {
		String str = "Java Exercises!";
		System.out.println("Original String = " + str);
		// Get the character at positions 0 and 10.
		int index1 = str.charAt(0); 
		int index2 = str.charAt(10); 
		// Print out the results.
		System.out.println("The character at position 0 is " + (char)index1);
		System.out.println("The character at position 10 is " + (char)index2); 
	}

}
