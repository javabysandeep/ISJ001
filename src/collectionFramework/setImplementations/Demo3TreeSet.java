package collectionFramework.setImplementations;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo3TreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet();
        //unique elements
        //insertion order
       // set.add("Some strings");
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(200);
        //set.add(null);
        //set.add(null);
       // set.add(null);
       // set.add(true);
        //set.add(true);
        System.out.println(set);
    }
}
