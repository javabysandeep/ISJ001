package oops.functionalInterfaces;

public class TestLambda {
    public static void main(String[] args) {

        //Lambda expression is used to implement only function interfaces.
        // it is a shorter way of implementing functional interfaces
        Calc addition = (number1, number2) -> number1 + number2;
        Calc substract = (number1, number2) -> number1 - number2;
        Calc multiply = (number1, number2) -> number1 * number2;
        Calc division = (number1, number2) -> number1 / number2;
        System.out.println("Addition " + addition.calculate(100, 200));
        System.out.println("Substraction " + substract.calculate(100, 200));
        System.out.println("Multiplication " + multiply.calculate(100, 200));
        System.out.println("Division " + division.calculate(100, 200));
    }
}
