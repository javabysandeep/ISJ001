package classComponents.constructors;

public class Demo {
    int a;
    int b;
    //a ,b are instance variables
    public static void main(String[] args) {
        //object creation
        Demo demo = new Demo();
        //Demo : class name or custom datatype
        //demo : reference variable
        //= : assignment operator which assigns right side value to the left side variable
        //new : it is a keyword which is used to allocate new memory for the object
        // Demo():  it is a call to the constructor ---> default constructor
        // new Demo()---> object
        System.out.println(demo.a);
        System.out.println(demo.b);
    }
}
