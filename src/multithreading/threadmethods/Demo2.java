package multithreading.threadmethods;

public class Demo2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            // count the no. objects created.
            System.out.println(Product.counter);

        }, "thread");
        thread.setDaemon(true);
        thread.start();


    }
}
