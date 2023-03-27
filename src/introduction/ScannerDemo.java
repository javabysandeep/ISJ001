package introduction;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int a = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some value");
        int value = scanner.nextInt();
        System.out.println("You have entered "+value);
    }
}
