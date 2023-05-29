package collectionFramework.mapImplementations;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(100,"mnp");
        map.put(89,"pnq");
        map.put(101,"abc");
        map.put(1,"mnp");
        map.put(11,"mnp");

        map.entrySet().forEach(System.out::println);

    }
}
