package fileHandling;

import java.io.File;

public class Demo7FileLength {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        System.out.println(file.length());
    }
}
