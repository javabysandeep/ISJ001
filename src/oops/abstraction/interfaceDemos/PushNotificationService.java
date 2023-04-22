package oops.abstraction.interfaceDemos;


public class PushNotificationService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending the message with Push notification");
    }
}
