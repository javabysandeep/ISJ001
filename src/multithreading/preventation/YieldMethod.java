package multithreading.preventation;

public class YieldMethod {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int index = 0; index < 10; index++) {
                System.out.println(index + " " + Thread.currentThread().getName());
            }
        }, "thread1");

        Thread thread2 = new Thread(() -> {
            for (int index = 0; index < 10; index++) {
                System.out.println(index + " " + Thread.currentThread().getName());
            }
        }, "thread12");

        thread1.setPriority(10);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();

        Thread.yield();

        //main thread
        for (int index = 0; index < 10; index++) {
            System.out.println(index + " " + Thread.currentThread().getName());
        }
    }
}
