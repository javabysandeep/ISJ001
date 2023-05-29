package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap();
        for (int i = 1; i <= 10; i++) {
            map.put(i, i + "A");
        }
        System.out.println("Map search Key: "+map.containsKey(8));
        System.out.println("Map search Value: "+map.containsValue("10A"));


    }
}
