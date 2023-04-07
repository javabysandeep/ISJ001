package classComponents.nestedClasses;

public class Test {
    public static void main(String[] args) {
        //access static members : we need class name
        System.out.println(StaticNestedClassDemo.Nested.b);
        StaticNestedClassDemo.Nested.m2();

        //access non-static members : we need reference variable
        StaticNestedClassDemo.Nested nested = new StaticNestedClassDemo.Nested();
        System.out.println(nested.a);
        nested.m1();
    }
}
