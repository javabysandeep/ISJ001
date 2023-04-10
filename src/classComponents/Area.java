package classComponents;

import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    void setDimension(int l, int b) {
        // assign local variable value to instance variable
        length = l;
        breadth = b;

    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        {
            //local block
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        Area area = new Area();
        //set dimension
        area.setDimension(length, breadth);
        System.out.println("Area of rectangle " + area.getArea());


    }
}
