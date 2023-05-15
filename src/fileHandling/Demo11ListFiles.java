package fileHandling;

import java.io.File;

public class Demo11ListFiles {
    public static void main(String[] args) {
        File folder = new File("src/exceptionHandling");
        File[] allFiles = folder.listFiles();
        for (File file:allFiles) {
            System.out.println(file.getName()+"\t"+file.length());
        }
    }
}
