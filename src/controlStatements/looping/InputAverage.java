package controlStatements.looping;

import java.util.Scanner;

public class InputAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 values");
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            int value = scanner.nextInt();
            sum +=value;
        }
        System.out.println("Average "+(sum/10));
    }
}
