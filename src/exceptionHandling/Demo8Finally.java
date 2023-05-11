package exceptionHandling;

public class Demo8Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);//5
            int[] array = {};
            System.out.println(array[0]);//AIOBE
            String str = "null";
            System.out.println(str.length());//4
        }
        catch (ArithmeticException exception) {
            System.out.println("divide by zero");
        }
        finally {
            //System.exit(0);
            System.out.println("finally is always executed");
        }
        System.out.println("Rest of main method");
    }
}
