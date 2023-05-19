package multithreading.way2;

import java.time.LocalDateTime;

public class SumThreadDemo {
    static long sum = 0;

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime startTime = LocalDateTime.now();

        Thread first = new Thread(() -> {
            for (int i = 0; i < Integer.MAX_VALUE / 2; i++) {
                sum += i;
            }
        });

        Thread second = new Thread(() -> {
            for (int i = Integer.MAX_VALUE / 2 + 1; i < Integer.MAX_VALUE; i++) {
                sum += i;
            }
        });


        first.start();
        second.start();

        first.join();
        second.join();

        //this will be completed by main thread.
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Sum " + sum);
        System.out.println("Time take to calculate sum " + (endTime.getSecond() - startTime.getSecond()));
    }
}
