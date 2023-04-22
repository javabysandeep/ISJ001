package oops.java8Features;

public class Child implements I1, I2{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        I1 i = new Child();
        i.m1();
        //i.m2();
    }
}
