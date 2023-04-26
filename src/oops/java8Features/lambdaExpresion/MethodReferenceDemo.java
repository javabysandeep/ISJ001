package oops.java8Features.lambdaExpresion;

public class MethodReferenceDemo {

    public static void main(String[] args) {
       // NumberTest evenTest = (x) -> x % 2 == 0;
        NumberTest evenTest = MethodReferenceDemo::isEven;
        System.out.println(evenTest.test(100));



    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
