package collectionFramework.mapImplementations;

import java.util.HashMap;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "welcome to collection framework class";
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (characterIntegerHashMap.containsKey(ch)) {
                characterIntegerHashMap.put(ch, characterIntegerHashMap.get(ch) + 1);
            } else {
                characterIntegerHashMap.put(ch, 1);

            }
        }
        characterIntegerHashMap.entrySet().forEach(System.out::println);
    }
}
