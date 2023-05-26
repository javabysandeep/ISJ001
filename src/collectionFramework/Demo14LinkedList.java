package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class Demo14LinkedList {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("India");
        stringList.add("UK");
        stringList.add("US");
        stringList.add("Maharastra");
        stringList.add("Karnataka");
        stringList.add("UK");
        stringList.add("UK");

        //1. Remove the element while iterating
        int size = stringList.size();
        for (int index = 0; index < size; index++) {
            if (stringList.get(index).startsWith("U")) {
                stringList.remove(index);
                size--;
            }
        }

        //2. Remove the element while iterating
       /* for (String str : stringList) {
            if (str.startsWith("U")) {
                stringList.remove(str);
            }
        }
        */

        //3. Remove the element while iterating
        //stringList.removeIf(string -> string.startsWith("U"));

        //cursors

        System.out.println(stringList);
    }
}
