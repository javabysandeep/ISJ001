package oops.functionalInterfaces;

public class TestMethodRef {
    public static void main(String[] args) {

        //Lambda expression is used to implement only function interfaces.
        // it is a shorter way of implementing functional interfaces
        Calc addition = Integer::sum;
        System.out.println("Addition " + addition.calculate(100, 200));

    }
}
