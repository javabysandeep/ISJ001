package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            int[] array = {};
            System.out.println(array[0]);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        } finally {
            System.out.println("finally");
        }
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
}
