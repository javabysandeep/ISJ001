package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.Set;

public class Demo1HashSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        //unique elements
        set.add("Some strings");
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(200);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(true);
        set.add(true);
        System.out.println(set);
    }
}
