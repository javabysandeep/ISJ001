package fileHandling;

import java.io.File;
import java.io.FileFilter;

public class Demo13ListFiles {
    public static void main(String[] args) {
        File folder = new File("src/exceptionHandling");
        File[] allFiles = folder.listFiles(file -> file.length() > 500);
        for (File file : allFiles) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
