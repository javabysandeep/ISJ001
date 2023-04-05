package classComponents.methods.assignments;

import java.util.Scanner;

public class Circle {
    int radius;
    static final double PI = 3.142D;

    double getArea(int radius) {
        return 3.142 * radius * radius;
    }

    double getCircumference(int radius){
        return 2 * 3.142 * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Enter the radius of a circle");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Area "+circle.getArea(radius));
        System.out.println("Circumference  "+circle.getCircumference(radius));


    }
}
