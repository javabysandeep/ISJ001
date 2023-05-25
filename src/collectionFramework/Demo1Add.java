package collectionFramework;


import java.util.ArrayList;

public class Demo1Add {
    public static void main(String[] args) {
        //Default capacity = 10
        // Object[] elements = {};
        //this.elementData = new Object[initialCapacity];
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(100);
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        //homogeenous, heterogenous, null, duplicate, insertion order

    }
}
