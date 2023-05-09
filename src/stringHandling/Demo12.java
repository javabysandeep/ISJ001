package stringHandling;

public class Demo12 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("welcome to String handling session");
        str.replace(0,10,"Exception");
        System.out.println(str);

        StringBuilder str2 = new StringBuilder("Collection framework");
        str2.reverse();
        System.out.println(str2);
    }
}
