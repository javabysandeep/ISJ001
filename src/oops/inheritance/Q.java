package oops.inheritance;

public class Q extends P {
    int a = 2000;

    static {
        System.out.println("Q class static block");
    }
    {
        System.out.println("Q class instance block");
    }
    Q() {
        super();
        System.out.println("Q class constructor");
    }

    void m1() {
        System.out.println("m1 from Q class");
    }

}
