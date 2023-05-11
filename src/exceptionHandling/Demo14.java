package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        try {
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            System.out.println("Division is " + number1 / number2);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid input type");
        } catch (ArithmeticException arithmeticException){
            System.out.println("Please enter non-zero denominator");
        }
    }
}
