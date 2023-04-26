package oops.java8Features.lambdaExpresion;

public class DummyServiceImpl implements DummyService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message " + message);
    }

    public static void main(String[] args) {
        //way 1. Named subclass way
        DummyService dummyService = new DummyServiceImpl();
        dummyService.sendMessage("hello");

        //way 2: using inline anonymous class

        DummyService anonymousRef = new DummyService() {
            @Override
            public void sendMessage(String message) {
                System.out.println("Sending message with anonymous class " + message);
            }
        };
        anonymousRef.sendMessage("Hi");

        //way3: using Lambda expression
        DummyService lambdaRef =  (message) -> System.out.println("Sending message with Lambda "+message);
        lambdaRef.sendMessage("Hi Lambda");
    }
}
