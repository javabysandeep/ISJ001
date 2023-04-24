package oops.anonymousClass;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("running using separate subclass way");
    }
}
