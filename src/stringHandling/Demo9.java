package stringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String str = "some data";
        //convert this str into char array
        char[] charArray = str.toCharArray();

        String s1 = "a";
        String s2 = "A";
        System.out.println(s1.compareTo(s2));

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

    }
}
