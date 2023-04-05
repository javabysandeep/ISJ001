package classComponents.constructors;


public class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        //zero param con
    }
    Rectangle(int l){
        length = l;
    }
    Rectangle(int l, int b){
        //we are assigning local variable values to the instance variables
        length = l;
        breadth = b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Length = "+rectangle.length+"\t Breadth = "+rectangle.breadth);

        Rectangle rectangle2 = new Rectangle(50,200);
        System.out.println("Length = "+rectangle2.length+"\t Breadth = "+rectangle2.breadth);
    }
}
