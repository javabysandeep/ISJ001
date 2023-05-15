package fileHandling;

import java.io.File;

public class Demo5DeleteFile {
    public static void main(String[] args) {
        File file = new File("student.txt");
        boolean isFileDeleted = file.delete();
        System.out.println("Is File deleted "+isFileDeleted);
    }
}
