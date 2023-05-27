package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2QueueInspect {
    public static void main(String[] args) {

        Queue queue = new LinkedList();
     /*   queue.add("Ram");
        queue.add("Shyam");
        queue.add("Ganesh");
        queue.add("Sita");
        queue.add("Laxman");*/
        System.out.println("Inspection "+queue.peek());
        System.out.println("Inspection "+queue.element());

        System.out.println("Size of Queue "+queue.size());

    }
}
