package classComponents.constructors.assignments;

import java.util.Scanner;

public class Average {
    int number1;
    int number2;
    int number3;

    public Average(int n1, int n2, int n3) {
        number1 = n1;
        number2 = n2;
        number3 = n3;
    }

    int calculateAverage() {
        return (number1 + number2 + number3) / 3;
    }
    void printAverage(){
        System.out.println("Average of three numbers is "+ calculateAverage());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        Average average = new Average(number1, number2, number3);
        average.printAverage();
    }
}
