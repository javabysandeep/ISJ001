package oops.callByValue;

public class Demo {
    static int add(int a, int b) {
        a = 1000;
        b = 2000;
        return a + b;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("Addition " + add(a, b));//3000
        System.out.println("a value " + a);//100
        System.out.println("b value " + b);//200
    }
}
