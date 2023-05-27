package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo6 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);

        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            Object element = listIterator.next();
            Integer integer = (Integer) element;
            if(integer==500){
//                listIterator.add(3000);
//                listIterator.set(50000);
                listIterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
