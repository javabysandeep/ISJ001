package userInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number1");
        int number1 = scanner.nextInt();

        System.out.println("Enter a number2");
        int number2 = scanner.nextInt();

        System.out.println("Sum of two numbers "+ (number1+number2));
    }
}
