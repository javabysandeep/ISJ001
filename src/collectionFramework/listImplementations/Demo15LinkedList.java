package collectionFramework.listImplementations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo15LinkedList {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("India");
        stringList.add("UK");
        stringList.add("US");
        stringList.add("Maharastra");
        stringList.add("Karnataka");

        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);

    }
}
