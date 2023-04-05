package classComponents.methods.assignments;

public class Triangle {
    int side1;
    int side2;
    int side3;

    int getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        return 0.5 * (side1 + side2 + side3);
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;
        int perimeter = triangle.side1 + triangle.side2 + triangle.side3;
        //System.out.println("Perimeter of a triangle " + perimeter);
        //System.out.println("Area of a triangle " + perimeter * (perimeter - triangle.side1));
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
