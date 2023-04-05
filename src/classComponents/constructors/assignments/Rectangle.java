package classComponents.constructors.assignments;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    double getArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        System.out.println("Area of rectangle1 "+rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle(5,8);
        System.out.println("Area of rectangle2 "+rectangle2.getArea());
    }
}
