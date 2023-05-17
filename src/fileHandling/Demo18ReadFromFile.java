package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo18ReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("ISJ001Notes.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();

    }
}
