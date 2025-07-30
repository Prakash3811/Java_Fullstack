package Day4;


public class create_unique_identifier_of_given_string {
	public static void main(String[] args) {
		String str = "Python Exercises.";
		// Get the hash code for the above string.
		int hash_code = str.hashCode(); 
		// Display the hash code.
		System.out.println("The hash for " + str + " is " + hash_code);
	}

}
