package Day5;

import java.io.File;
import java.io.FilenameFilter;

public class faile_name {
	public static void main(String a[]) {
        File file = new File("C:\\\\Users\\\\pk845\\\\OneDrive\\\\Desktop\\\\intership");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".py")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f : list) {
            System.out.println(f);
        }
    }

}
