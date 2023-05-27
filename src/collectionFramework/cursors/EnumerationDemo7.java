package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo7 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(100);
        vector.add(200);
        vector.add(null);
        vector.add(300);
        vector.add(400);
        vector.add(500);
        vector.add(600);
        vector.add(700);

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Object element = enumeration.nextElement();
            if(element==null) {
               //enumeration.add(5000);
           }
            System.out.println(element);
        }

    }
}
