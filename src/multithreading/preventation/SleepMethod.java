package multithreading.preventation;

public class SleepMethod {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int index = 0; index < 10; index++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(index+" "+Thread.currentThread().getName());
            }
        }, "customThread");
        thread.start();
    }
}
