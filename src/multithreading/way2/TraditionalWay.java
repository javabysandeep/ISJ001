package multithreading.way2;

public class TraditionalWay implements Runnable {
    @Override
    public void run() {
        System.out.println("run method : job of user defined thread");
    }

    public static void main(String[] args) {
        //Runnable runnable = new Worker();
        Thread thread = new Thread(new TraditionalWay());
        thread.start();
    }
}
