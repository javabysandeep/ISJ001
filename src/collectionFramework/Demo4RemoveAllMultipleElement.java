package collectionFramework;


import java.util.ArrayList;

public class Demo4RemoveAllMultipleElement {
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
        System.out.println("Before");
        System.out.println(arrayList);

        ArrayList deleteList = new ArrayList();
        deleteList.add(null);
        deleteList.add("abc");

        arrayList.removeAll(deleteList);
        System.out.println("After");
        System.out.println(arrayList);



    }
}
