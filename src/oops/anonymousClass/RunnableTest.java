package oops.anonymousClass;

public class RunnableTest {
    public static void main(String[] args) {
        //1. implement the functional interface with traditional subclass way
        Runnable runnable = new RunnableImpl();
        runnable.run();

        //2. using anonymous class
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("running using anonymous class way");
            }
        };
        anonymous.run();

        //3. using lambda expression : it is a shorter, concise way of implementing functional interfaces
        Runnable lambda = () -> System.out.println("running using lambda expression way");
        lambda.run();

    }
}
