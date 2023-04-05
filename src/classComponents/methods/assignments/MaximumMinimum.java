package classComponents.methods.assignments;

import java.util.Scanner;

public class MaximumMinimum {
    static int getMaximumNumber(int number1, int number2, int number3) {
        return (number1 > number2 && number1 > number3)
                ? (number1)
                : (
                (number2 > number1 && number2 > number3) ? (number2) : (number3)
        );
    }

    static int getMinimumNumber(int number1, int number2, int number3) {
        return (number1 < number2 && number1 < number3)
                ? (number1)
                : (
                (number2 < number1 && number2 < number3) ? (number2) : (number3)
        );
    }

    static boolean isEligibleVote(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("Max " + getMaximumNumber(number1, number2, number3));
        System.out.println("Minimum " + getMinimumNumber(number1, number2, number3));
        System.out.println("Is eligible to vote "+isEligibleVote(20));
    }
}
