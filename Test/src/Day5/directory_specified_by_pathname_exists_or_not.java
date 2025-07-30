package Day5;

import java.io.File;

public class directory_specified_by_pathname_exists_or_not {
	public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("/home/students/xyz.txt");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }

}
