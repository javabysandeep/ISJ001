package oops.java8Features.defaultMethods;

public interface MessageService {
    void sendMessage();// public abstract
    default void receiveMessage(){}// default implementation for all of the subclasses so that subclass wont break
   // public abstract void m2(){}: instance methods are not allowed in an interface as by default methods are public abstract:
    static void m2(){
        System.out.println("static method in interface");
    }
}
