package userInput;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the boolean value");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("you have entered "+booleanValue);
    }
}
