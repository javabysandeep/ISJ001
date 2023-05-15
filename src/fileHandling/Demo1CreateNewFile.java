package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //create new file
        boolean isFileCreated = file.createNewFile();
        System.out.println("Is new file created "+isFileCreated);
    }
}
