package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("/ Divide by zero");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Exception handled : " + arithmeticException.getMessage());
        }
        System.out.println("Rest of the main ");
    }
}
