package operators;

public class Operations12 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a++ + ++b + c++ + --c + ++a + b-- + ++b);//19
        System.out.println("a "+a);//3
        System.out.println("b "+b);//3
        System.out.println("c "+c);//3

    }
}