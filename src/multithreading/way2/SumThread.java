package multithreading.way2;

import java.time.LocalDateTime;

public class SumThread {
    static long sum = 0;

    public static void main(String[] args) {
        LocalDateTime startTime = LocalDateTime.now();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Sum " + sum);
        System.out.println("Time take to calculate sum " + (endTime.getSecond() - startTime.getSecond()));
    }
}
