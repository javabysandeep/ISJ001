package collectionFramework.mapImplementations;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap();
        for (int i = 1; i <= 10; i++) {
            map.put(i, i + "A");
        }
        map.put(null,"null");
        map.put(null,"null");
        map.put(null,"abc");

        map.entrySet().forEach(System.out::println);


    }
}
