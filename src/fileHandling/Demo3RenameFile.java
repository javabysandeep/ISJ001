package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3RenameFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abx.txt");
        File newFileName = new File("student.txt");
        boolean renameTo = file.renameTo(newFileName);
        System.out.println("File renamed  "+renameTo);
    }
}
