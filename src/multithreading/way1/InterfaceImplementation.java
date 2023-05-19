package multithreading.way1;

public class InterfaceImplementation {
    public static void main(String[] args) {
        //to implement functional interface
        //1. create a separate class and implement the interface
        Runnable worker = new Worker2();
        worker.run();

        //2. create an anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method usng anonymous class");
            }
        };
        runnable.run();

        //3. using lambda expression
        Runnable lambda = ()-> System.out.println("run method using lambda");
        lambda.run();



    }
}
