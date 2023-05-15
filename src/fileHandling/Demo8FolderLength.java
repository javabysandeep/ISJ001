package fileHandling;

import java.io.File;

public class Demo8FolderLength {
    public static void main(String[] args) {
        File folder = new File("src");
        System.out.println(folder.length());
    }
}
