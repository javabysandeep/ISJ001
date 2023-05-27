package collectionFramework.cursors;

import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);
        vector.add(600);
        vector.add(700);

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Integer integer = (Integer) next;
            if (integer == 700) {
                iterator.remove();
            }
        }
        System.out.println(vector);
    }
}
