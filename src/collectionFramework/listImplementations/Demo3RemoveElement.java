package collectionFramework.listImplementations;


import java.util.ArrayList;

public class Demo3RemoveElement {
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
        System.out.println("Before remove");
        System.out.println(arrayList);

        System.out.println("After remove");
        arrayList.remove(0);
        arrayList.remove(null);
        System.out.println(arrayList);



    }
}
