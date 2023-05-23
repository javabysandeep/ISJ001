package multithreading.synchronization;

public class Addition {
    long sum = 0;

    public Addition() {

    }

    void add(int start, int end) {
        synchronized (this) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Addition addition = new Addition();
        Thread thread1 = new Thread(() -> addition.add(1, Integer.MAX_VALUE / 2));
        Thread thread2 = new Thread(() -> addition.add(Integer.MAX_VALUE / 2 + 1, Integer.MAX_VALUE));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Sum is " + addition.sum);
    }
}
