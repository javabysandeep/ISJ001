package classComponents.assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Addition: " + Calculator.add(number1, number2));
        System.out.println("Subtraction: " + Calculator.subtract(number1, number2));
        System.out.println("Multiplication: " + Calculator.multiply(number1, number2));
        System.out.println("Division Quotient: " + Calculator.divisionQuotient(number1, number2));
        System.out.println("Division Remainder: " + Calculator.divisionRemainder(number1, number2));
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    static int divisionQuotient(int number1, int number2) {
        return number1 / number2;
    }

    static int divisionRemainder(int number1, int number2) {
        return number1 % number2;
    }
}
