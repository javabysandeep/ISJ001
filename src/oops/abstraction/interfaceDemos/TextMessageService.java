package oops.abstraction.interfaceDemos;


public class TextMessageService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending the message with sms");
    }
}
