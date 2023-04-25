package oops.java8Features.lambdaExpresion;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i <10 ; i++) {
                System.out.print("running "+i);
            }
        };
        runnable.run();
    }
}
