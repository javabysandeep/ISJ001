package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo4RenameFolder {
    public static void main(String[] args) throws IOException {
        File oldFolder = new File("studentDetails");
        File newFolder = new File("studentDetails1");
        System.out.println("File renamed  " + oldFolder.renameTo(newFolder));
    }
}
