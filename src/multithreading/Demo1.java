package multithreading;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        thread.start();
        m1();



    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        System.out.println(10 / 0);
    }
}
