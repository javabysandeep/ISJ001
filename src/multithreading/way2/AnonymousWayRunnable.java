package multithreading.way2;

public class AnonymousWayRunnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method using anonymous class ");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
