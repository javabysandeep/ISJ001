package fileHandling;

import java.io.File;

public class Demo6DeleteFolder {
    public static void main(String[] args) {
        File folder = new File("studentDetails1");
        boolean isFolderDeleted = folder.delete();
        System.out.println("Is Folder deleted "+isFolderDeleted);
    }
}
