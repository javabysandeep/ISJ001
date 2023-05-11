package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        }
    }

    private static void m1() throws ArithmeticException{
        m2();
    }

    private static void m2() throws ArithmeticException{
        m3();
    }

    private static void m3() throws ArithmeticException{
        System.out.println(10 / 0);
    }
}
