package stringHandling;

public class Demo6 {
    public static void main(String[] args) {
        String str = "hwelcome to string handling";
       // System.out.println(str.charAt(0));
        for (int index = 0; index < str.length(); index++) {
            System.out.println(str.charAt(index));
        }

        System.out.println("Position of the character");
        System.out.println(str.indexOf("h"));
        System.out.println(str.lastIndexOf("h"));
    }
}
