package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Abc");
        map.put(2, "Xyz");
        map.put(4, "Mnp");
        map.put(null, 200);
        map.put(100, "value updated");

        Set<Map.Entry> entrySet = map.entrySet();
        System.out.println("no of entries " + entrySet.size());

        //tradtional way
        /*for (int i = 1; i <= entrySet.size() ; i++) {
           // System.out.println(entrySet.);
        }*/

        //enhanced for loop
       /* for (Map.Entry entry : entrySet) {
           // System.out.println(entry.getKey() + "\t" + entry.getValue());
            System.out.println(entry);
        }*/

        // java 8 way
        //entrySet.forEach(System.out::println);

        //using Cursor : Iterator
        Iterator<Map.Entry> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
