package multithreading.synchronization;

public class Message {
    synchronized void sendMessage() {
        try {
            System.out.println("Sent the message at " + System.currentTimeMillis());
            wait();
            System.out.println("Resumed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized void receiveMessage() {
        System.out.println("Received the message at " + System.currentTimeMillis());
        notify();
        System.out.println("Notified the waiting thread");
    }
}
