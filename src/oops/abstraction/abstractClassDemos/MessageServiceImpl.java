package oops.abstraction.abstractClassDemos;

//1. remove the abstract methods from parent class
//2. make subclass as abstract
//3. When one concrete class extends an abstract class then it is compulsory for the child class to override all the abstract methods

public class MessageServiceImpl extends MessageService {
    @Override
     void sendMessage(String message) {
        System.out.println("sending message");
    }
    MessageServiceImpl(){
        //1. call to the parent class constructor
        //2. execute if any instance block of the same class
        System.out.println("MessageServiceImpl constructor");
    }
}
