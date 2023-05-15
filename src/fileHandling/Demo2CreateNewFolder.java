package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2CreateNewFolder {
    public static void main(String[] args) throws IOException {
        File folder = new File("studentDetails");
        //create new folder
        boolean isFolderCreated = folder.mkdir();
        System.out.println("Is new Folder created "+isFolderCreated);
    }
}
