package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class read_input_from_the_Java_console {
	public static void main(String[] args) throws IOException
	  {
	    BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Input your name: ");
	    String name = R.readLine();
	    System.out.println("Your name is: " + name);
	  }

}
