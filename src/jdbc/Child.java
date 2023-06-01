package jdbc;

public class Child extends Parent {
    Child() {
        super();
        //instance block of child class
        System.out.println("no arguments constructor of Child class");
    }

    {
        System.out.println("instance block of Child class");
    }

    static {
        System.out.println("static block of Child class");
    }

    //method overriding
    @Override
    void m1(){
        System.out.println("m1 method from child class");
    }
}
