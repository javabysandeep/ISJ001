package oops.java8Features.lambdaExpresion;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator addition = (number1, number2) -> number1 + number2;
        System.out.println("Addition " + addition.calculate(100, 200));

        Calculator substraction = (number1, number2) -> number1 - number2;
        System.out.println("substraction " + substraction.calculate(1000, 200));


        Calculator multiply = (number1, number2) -> number1 * number2;
        System.out.println("Multiplication " + multiply.calculate(10, 200));

    }
}
