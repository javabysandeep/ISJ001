package exceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Inner catch divide by zero");
            } finally {
                System.out.println("inner finally");
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println("divide by zero");
        } finally {
            System.out.println("outer finally");
        }
    }
}
