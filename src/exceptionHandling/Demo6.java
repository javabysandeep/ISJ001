package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/5);
            int[] array = {};
            System.out.println(array[0]);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Invalid denominator");
        }
        System.out.println("rest of the main");
    }
}
