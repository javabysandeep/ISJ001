package multithreading.way2;

public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("run method using lambda");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
