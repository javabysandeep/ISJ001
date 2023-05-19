package multithreading.way1;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();

        // main thread should wait for thead1 and thread2 to complete thier execution
        thread1.join();
        thread2.join();
        System.out.println("Sum " + AdditionTask.sum);
    }
}
