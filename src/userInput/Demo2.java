package userInput;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //creating the object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Enter your city");
        String city = scanner.next();

        System.out.println("Welcome "+name+" to the "+city);
    }
}
