package oops.java8Features.defaultMethods;

public class MessageServiceImpl1 implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("sending messages");
    }

    @Override
    public void receiveMessage() {
        System.out.println("receive message");
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl1();
        messageService.sendMessage();
        //messageService.receiveMessage();
    }
}
