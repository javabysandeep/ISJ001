package oops.anonymousClass;

public class MessageServiceImpl implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("sending message using subclass");
    }
}
