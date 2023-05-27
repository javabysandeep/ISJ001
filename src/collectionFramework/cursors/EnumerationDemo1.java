package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);
        vector.add(600);
        vector.add(700);
        Enumeration enumeration = vector.elements();

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());


    }
}
