package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(100, 100);
        map.put("100", 100);
        map.put(null, 100);
        map.put(null, 200);
        map.put(100, "value updated");
        System.out.println(map);

        System.out.println("read the value : " + map.get(100));
        System.out.println("Only keys : " + map.keySet());
        System.out.println("Only Values : " + map.values());
        System.out.println("All Entries : " + map.entrySet());
    }
}
