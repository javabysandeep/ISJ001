package oops.functionalInterfaces;

public class Test {
    public static void main(String[] args) {
        Calc addition = new Addition();
        Calc subtraction = new Substraction();
        Calc multiplication = new Multiplication();
        Calc division = new Division();

        System.out.println("Addition "+addition.calculate(100,200));
        System.out.println("Subtraction  "+subtraction.calculate(100,200));
        System.out.println("Multiplication "+multiplication.calculate(100,200));
        System.out.println("Division "+division.calculate(100,200));
    }
}
