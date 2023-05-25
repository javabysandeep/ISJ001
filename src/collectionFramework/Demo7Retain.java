package collectionFramework;


import java.util.ArrayList;

public class Demo7Retain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("Pune");


        ArrayList keepIt = new ArrayList();
        keepIt.add("abc");
        keepIt.add("Pune");

        arrayList.retainAll(keepIt);
        System.out.println(arrayList);

    }
}

