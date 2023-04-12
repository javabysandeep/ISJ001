package oops.inheritance;

public class P {
    int a = 200;
    static {
        System.out.println("P :static block");
    }
    {
        System.out.println("P: instance block");
    }
    P(){
        System.out.println("P class constructor");
    }
    void m1(){
        System.out.println("m1 from P class");
    }

}
