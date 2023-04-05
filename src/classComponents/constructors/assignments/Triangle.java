package classComponents.constructors.assignments;

import java.util.Scanner;

public class Triangle {
    //Write a program to print the area and perimeter of a triangle
    // having sides of 3, 4 and 5 units by creating a class named 'Triangle'
    // with constructor having the three sides as its parameters.
    int side1;
    int side2;
    int side3;

    Triangle(int s1, int s2, int s3){
        //s1,s2,s3 ----> local variables --> input to the constructor
        side1 = s1;
        side2 = s2;
        side3 = s3;
        //side1, side2, side3 ---> instance variables
        // we are assigning local variable value to instance variables
    }

    int getPerimeter(){
        return side1 + side2 + side3;
    }

    double getArea(){
        return 0.5 * getPerimeter();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        Triangle triangle = new Triangle(side1,side2,side3);
        System.out.println("Perimeter of the triangle "+ triangle.getPerimeter());
        System.out.println("Area of the triangle "+triangle.getArea());
    }
}
