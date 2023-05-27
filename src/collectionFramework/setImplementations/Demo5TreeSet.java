package collectionFramework.setImplementations;

import java.util.TreeSet;

public class Demo5TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(100);
        treeSet.add(78);
        treeSet.add(92);
        treeSet.add(67);
        treeSet.add(56);
        treeSet.add(88);

        treeSet.forEach(System.out::println);
    }
}
