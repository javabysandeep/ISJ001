package multithreading.preventation;

public class JoinMethod2 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread2 = new Thread(() -> {
            for (int index = 0; index < 3; index++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(index + " " + Thread.currentThread().getName());
            }
        }, "thread2");
        Thread thread1 = new Thread(() -> {

            for (int index = 0; index < 3; index++) {
                try {
                    thread2.join();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(index + " " + Thread.currentThread().getName());
            }
        }, "thread1");

        thread1.start();
        thread2.start();
        thread1.join(10000);
        thread2.join(10000);

        //main thread
        for (int index = 0; index < 10; index++) {
            System.out.println(index + " " + Thread.currentThread().getName());
        }
    }
}
