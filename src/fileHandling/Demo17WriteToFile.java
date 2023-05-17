package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo17WriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,false);
        for (int i = 65; i <= 100; i++) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
        System.out.println("File write complete");


    }
}
