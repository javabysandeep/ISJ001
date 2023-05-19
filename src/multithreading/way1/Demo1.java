package multithreading.way1;

public class Demo1 {
    public static void main(String[] args) {

        //creating a thread by extending Thread class with the help of anonymous class
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++) {
                    System.out.println(Thread.currentThread().getName() + index);
                }
            }
        };
        thread.setName("user-defined-thread");
        thread.start();

        for (int index = 0; index < 10; index++) {
            System.out.println(Thread.currentThread().getName() + index);
        }

    }
}
