package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo14CreateMultipleFiles {
    public static void main(String[] args) throws IOException {
        for (int index = 0; index < 1000; index++) {
            File file  = new File("studentDetails/temp"+index+".txt");
            file.createNewFile();
        }
        System.out.println("100 files are created");
    }
}
