package collectionFramework.queueImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> integers = new PriorityQueue<>();
        integers.add(1);
        integers.add(101);
        integers.add(10);
        integers.add(88);
        integers.add(12);
        integers.add(20);
        integers.add(9);
        int size = integers.size();
        for (int i = 1; i <= size; i++) {
            System.out.println(integers.poll());
        }

    }
}
