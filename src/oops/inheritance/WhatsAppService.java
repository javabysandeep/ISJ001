package oops.inheritance;

public class WhatsAppService extends MessageService{
    void sendMessage() {
        System.out.println("sending message with whatsapp");
    }

    public static void main(String[] args) {
        WhatsAppService whatsAppService = new WhatsAppService();
        whatsAppService.sendMessage();
    }
}
