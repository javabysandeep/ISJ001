package oops.abstraction.interfaceDemos;

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
        child.m2();

        I1 i1 = new Child();
        i1.m1();
        //i1.m2();//CTE m2 is not in I1

        I2 i2 = new Child();
        i2.m2();
        //i2.m1();//CTE: m1 is not in I2
    }
}
