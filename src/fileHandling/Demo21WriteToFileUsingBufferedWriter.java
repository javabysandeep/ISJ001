package fileHandling;

import java.io.*;
import java.time.LocalDateTime;

public class Demo21WriteToFileUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        LocalDateTime startTime = LocalDateTime.now();
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 5000000; i++) {
            bufferedWriter.write(66);
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Time taken " + (startTime.getSecond() - endTime.getSecond()));
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write operation  complete");

    }
}
