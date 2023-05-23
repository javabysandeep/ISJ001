package multithreading.synchronization;

public class Counter {
    int count = 0;

    synchronized void add() {
        count++;
    }
}
