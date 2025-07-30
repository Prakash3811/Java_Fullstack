package Day5;

import java.io.File;
import java.util.Date;

public class determine_the_last_modified_date_of_file {
	public static void main(String[] args) {
	       File file = new File("test.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
	     }

}
