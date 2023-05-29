package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfEachWord {
    public static void main(String[] args) {
        String str = "Welcome to collection framework class Welcome class to";
        String[] words = str.split(" ");
        Map<String, Integer> stringIntegerMap = new LinkedHashMap<>();
        for (String word : words) {
            if (stringIntegerMap.containsKey(word)) {
                stringIntegerMap.put(word, stringIntegerMap.get(word) + 1);
            } else {
                stringIntegerMap.put(word, 1);

            }
        }
        stringIntegerMap.entrySet().forEach(System.out::println);

    }
}
