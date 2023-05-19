package multithreading.way1;

public class Thread2 extends Thread{
    @Override
    public void run() {
        AdditionTask additionTask = new AdditionTask(1000001, 2000000);
        additionTask.add();
    }
}
