package oops.java8Features.defaultMethods;

public class C implements I1, I2{
    @Override
    public void m1() {
        //own login
        I1.super.m1();
        I2.super.m1();
    }

    public static void main(String[] args) {
        I1 i1 = new C();
        i1.m1();

        I2 i2 = new C();
        i2.m1();
    }
}
