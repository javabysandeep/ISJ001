package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo16WriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("File is created successfully " + file.createNewFile());
        //Write to file in terms of bytes
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(100);
        fileOutputStream.close();
        System.out.println("File write complete");


    }
}
