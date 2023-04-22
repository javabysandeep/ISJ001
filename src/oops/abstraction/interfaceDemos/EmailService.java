package oops.abstraction.interfaceDemos;


public class EmailService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending the message with email");
    }
}
