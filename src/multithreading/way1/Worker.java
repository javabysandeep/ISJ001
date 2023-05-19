package multithreading.way1;

public class Worker extends Thread {
    public Worker() {
        super();
    }

    @Override
    public void run() {
        System.out.println("job of worker");
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start(); // internally it will call run method of Thread class and that run method calls subclass run method
    }
}
