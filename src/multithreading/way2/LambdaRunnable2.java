package multithreading.way2;

public class LambdaRunnable2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("run method using lambda"));
        thread.start();
    }
}
