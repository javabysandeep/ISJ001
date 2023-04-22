package oops.abstraction.interfaceDemos;


public class WhatsAppMessageService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending the message with WhatsApp API");
    }
}
