package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class Demo9Homogeneous {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(87);
        integerList.add(56);
        integerList.add(76);
        integerList.add(86);
        integerList.add(96);
        integerList.add(87);
        integerList.add(10);
        System.out.println(integerList);
        integerList.removeIf((element) -> element % 2 != 0);
        System.out.println(integerList);

    }
}
