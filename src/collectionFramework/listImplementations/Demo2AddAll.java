package collectionFramework.listImplementations;


import java.util.ArrayList;

public class Demo2AddAll {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(100);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(arrayList);

        System.out.println("New list size "+arrayList1.size());



    }
}
