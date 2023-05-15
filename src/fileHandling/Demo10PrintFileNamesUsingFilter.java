package fileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class Demo10PrintFileNamesUsingFilter {
    public static void main(String[] args) {
        File folder = new File("src/exceptionHandling");
        String[] fileNames = folder.list((dir, name) -> name.startsWith("I"));
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }
}
