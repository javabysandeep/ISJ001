package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo20ReadFileCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //Read from file in terms of characters
        FileReader fileReader = new FileReader(file);
        int character = fileReader.read();
        while (character != -1) {
            System.out.print((char) character);
            character = fileReader.read();
        }
        fileReader.close();

    }
}
