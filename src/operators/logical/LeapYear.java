package operators.logical;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int a = 30;
        //this line helps us in accepting the user input
        Scanner scanner = new Scanner(System.in);
        //scanner: is reference variable
        //Scanner : it is custom data type: class name
        // = : it is assignment operator
        //new : it is a keyword to create object in java
        // Scanner(): constructor call
        // System.in: input to the Scanner class constructor

        // class and object

        System.out.println("Enter the year");
        //
        int year = scanner.nextInt();
        System.out.println(((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))) ? "It's leap year" : "Its not a leap year");
    }
}
