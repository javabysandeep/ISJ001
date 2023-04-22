package oops.multipleInheirtance;

public class Subclass implements I1, I2 {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        I1 i1 = new Subclass();
        i1.m1();
        //i1.m2();


        I2 i2 = new Subclass();
        i2.m2();
        i2.m1();
    }
}
