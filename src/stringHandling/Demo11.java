package stringHandling;

public class Demo11 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abc");
        str.append(" xyz");
        System.out.println(str);
        str.insert(4,"at the beginning ");
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
        str.delete(0,10);
        System.out.println(str);



    }
}
