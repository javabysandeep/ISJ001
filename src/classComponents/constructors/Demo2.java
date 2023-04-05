package classComponents.constructors;

import classComponents.methods.Demo;

public class Demo2 {
    int a;
    int b;
    Demo2(){
        System.out.println("its zero or no-args constructor");
        a=10;
        b=20;
    }
    //a ,b are instance variables
    public static void main(String[] args) {
        //object creation
        Demo2 demo2 = new Demo2();
        Demo2 demo3 = new Demo2();
        //Demo2 : class name or custom datatype
        //demo2 : reference variable
        //= : assignment operator which assigns right side value to the left side variable
        //new : it is a keyword which is used to allocate new memory for the object
        // Demo2():  it is a call to the constructor ---> zero or no-args constructor
        // new Demo2()---> object
        System.out.println(demo2.a);
        System.out.println(demo2.b);
    }
}
