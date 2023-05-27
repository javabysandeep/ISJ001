package collectionFramework.listImplementations;


import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Demo5RemoveIfJava8 {
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

//        arrayList.removeIf((input) -> input == null);
        arrayList.removeIf(Objects::isNull);
        System.out.println("After");
        System.out.println(arrayList);


    }
}
