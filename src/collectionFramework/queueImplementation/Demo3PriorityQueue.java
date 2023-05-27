package collectionFramework.queueImplementation;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3PriorityQueue {
    public static void main(String[] args) {
        Queue<String> messages = new PriorityQueue<>(Comparator.comparingInt(String::length));
//        Queue<String> messages = new PriorityQueue<>((s1,s2)->s1.length()-s2.length());
        messages.add("hi");
        messages.add("hello");
        messages.add("how are you doing?");
        messages.add("I was asking do you know collection framework");
        messages.add("I need some help");
        messages.add("can we catchup today afternoon at Pop Tates");
        for (int i = 1; i <=6 ; i++) {
            System.out.println(messages.poll());
        }

    }
}
