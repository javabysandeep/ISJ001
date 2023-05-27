package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2LinedHashSet {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        //unique elements
        //insertion order
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
