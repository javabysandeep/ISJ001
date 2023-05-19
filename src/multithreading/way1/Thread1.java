package multithreading.way1;

public class Thread1 extends Thread {
    @Override
    public void run() {
        AdditionTask additionTask = new AdditionTask(1, 1000000);
        additionTask.add();
    }
}
