package collectionFramework.queueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1Queue {
    public static void main(String[] args) {
//        PriorityQueue
//        LinkedList
//        ArrayDeque
        Queue queue = new LinkedList();
        queue.add("Ram");
        queue.add("Shyam");
        queue.add("Ganesh");
        queue.add("Sita");
        queue.add("Laxman");

        System.out.println("Size of Queue "+queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //System.out.println(queue.remove());//NoSuchElementException
        System.out.println("Size of Queue "+queue.size());

    }
}
