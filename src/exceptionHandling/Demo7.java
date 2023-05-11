package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);//5
            int[] array = {1};
            System.out.println(array[0]);//1
            String str = "null";
            System.out.println(str.length());//4
            //exception prone code
        }
        //System.out.println("independent statements are not allowed");
        catch (ArithmeticException exception) {
            System.out.println("divide by zero");
        } catch (NullPointerException npe) {
            System.out.println("null reference");
        } catch (ArrayIndexOutOfBoundsException aa) {
            System.out.println("index out of range");
        }
        System.out.println("Rest of main method");
    }
}
