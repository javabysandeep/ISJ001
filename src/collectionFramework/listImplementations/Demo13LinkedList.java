package collectionFramework.listImplementations;

import java.util.LinkedList;
import java.util.List;

public class Demo13LinkedList {
    public static void main(String[] args) {

        // homo, heter, null, IO
        List<Integer> list = new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(311);
        list.add(null);

        System.out.println("Size " + list.size());
        System.out.println("Is it empty " + list.isEmpty());

        list.remove(1);
        list.remove(Integer.valueOf(300));
        list.removeIf(number -> number % 2 != 0);
        System.out.println(list);
    }
}
