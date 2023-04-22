package oops.abstraction.abstractClassDemos;

abstract public class MessageService {

    //constructor
    MessageService(){
        //1. its own parent class constructor
        //2. execute if any instance block
        System.out.println("zero param con in abstract class");
    }
    //concrete class + abstract methods
    int instanceVariable;
    static int staticVariable;
    void instanceMethod(){
        System.out.println("abstract class:  instance method");
    }
    static void staticMethod(){
        System.out.println("abstract class : static method");
    }
    {
        System.out.println("instance block of abstract class");
    }
    static {
        System.out.println("static block of abstract class");
    }
    class InnerClass {}
    static class StaticNestedClass{}

    //incomplete method
    abstract void sendMessage(String message);

}
