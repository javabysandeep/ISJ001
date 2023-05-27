package collectionFramework.setImplementations;

import java.util.Set;
import java.util.TreeSet;

public class Demo4TreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("Core Java");
        treeSet.add("Advance Java");
        treeSet.add("Hibernate");
        treeSet.add("Spring Core");
        treeSet.add("Project");

        treeSet.forEach(System.out::println);
    }
}
