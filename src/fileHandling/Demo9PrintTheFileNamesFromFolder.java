package fileHandling;

import java.io.File;

public class Demo9PrintTheFileNamesFromFolder {
    public static void main(String[] args) {
        File folder = new File("src/exceptionHandling");
        String[] fileNames = folder.list();
        for (String fileName:fileNames) {
            System.out.println(fileName);
        }
    }
}
