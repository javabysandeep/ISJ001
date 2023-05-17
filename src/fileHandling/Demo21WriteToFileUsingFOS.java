package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo21WriteToFileUsingFOS {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        LocalDateTime startTime = LocalDateTime.now();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        for (int i = 0; i < 5000000; i++) {
            bufferedOutputStream.write(65);
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time taken " + (startTime.getSecond() - endTime.getSecond()));
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Write operation  complete");

    }
}
