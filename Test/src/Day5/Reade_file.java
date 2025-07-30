package Day5;
import java.io.File;
import java.util.Date;

public class Reade_file {
	public static void main(String a[]) {
        File file = new File("C:\\Users\\pk845\\OneDrive\\Desktop\\intership");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }

}
