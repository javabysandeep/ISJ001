package multithreading.way2;

public class AnonymousWayRunnable2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run method using anonymous class ");
            }
        });
        thread.start();

    }
}
