package multithreading.synchronization;

public class DemoWait {
    public static void main(String[] args) {
        Message message = new Message();

        Thread sender = new Thread(() -> message.sendMessage(), "sender");
        Thread receiver = new Thread(() -> message.receiveMessage(), "receiver");

        sender.start();
        receiver.start();
    }
}
