package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo19WriteToFileCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        //Write to file in terms of characters
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("we are able to write multiple characters at time");
        fileWriter.close();
        System.out.println("File write complete");


    }
}
