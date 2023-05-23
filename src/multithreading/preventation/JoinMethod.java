package multithreading.preventation;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int index = 0; index < 3; index++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(index + " " + Thread.currentThread().getName());
            }
        }, "thread1");
        thread1.start();
        thread1.join(10000);

        //main thread
        for (int index = 0; index < 10; index++) {
            System.out.println(index + " " + Thread.currentThread().getName());
        }
    }
}
