package oops.java8Features.lambdaExpresion;

public class NumberTestingApp {
    public static void main(String[] args) {
        //boolean test(int input);
        //1. check if it even
        //NumberTest evenTest = (number) -> number % 2 == 0;
        NumberTest evenTest = NumberTestingApp::isEven;

        System.out.println("Is It Even Number : " + evenTest.test(98));
        System.out.println("Is It Even Number : " + evenTest.test(99));

        //2. If the number is  multiple of 5
        NumberTest reference = (number) -> number % 5 == 0;
        System.out.println("Is It Multiple of 5 : " + reference.test(100));
        System.out.println("Is It Multiple of 5 : " + reference.test(98));

        //3. If the number is Perfect or Not
        NumberTest isPerfectNumber = (number) -> {
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors += i;
                }
            }
            return sumOfFactors == number;
        };
        System.out.println("Is 28  Perfect Number " + isPerfectNumber.test(28));//1,2,4,7,14
        System.out.println("Is 6 Perfect Number " + isPerfectNumber.test(6));//1,2,3
        System.out.println("Is 8 Perfect Number " + isPerfectNumber.test(8));//1,2,4

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
