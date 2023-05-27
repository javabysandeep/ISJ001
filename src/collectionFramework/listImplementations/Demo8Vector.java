package collectionFramework.listImplementations;

import java.util.*;

public class Demo8Vector {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add("abc");
        list.add(true);
        list.add(null);
        System.out.println(list);
        list.remove("abc");
        System.out.println(list);
        System.out.println("Size is  "+list.size());
    }
}
