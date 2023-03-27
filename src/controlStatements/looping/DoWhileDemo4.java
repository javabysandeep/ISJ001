package controlStatements.looping;

import java.util.Scanner;

public class DoWhileDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the character");
            ch = scanner.next().charAt(0);
            System.out.println("You have entered " + ch);
        } while (ch != 'x');
    }
}
