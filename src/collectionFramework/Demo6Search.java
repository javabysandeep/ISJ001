package collectionFramework;


import java.util.ArrayList;
import java.util.Objects;

public class Demo6Search {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("Pun1e");
        System.out.println(arrayList.contains("Pune"));

        arrayList.clear();
        System.out.println(arrayList);


    }
}

