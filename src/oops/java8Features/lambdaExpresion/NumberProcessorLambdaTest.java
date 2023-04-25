package oops.java8Features.lambdaExpresion;

public class NumberProcessorLambdaTest {
    public static void main(String[] args) {
        /// lambda expression is used to implement only functional interfaces.

        NumberProcessor square = (number) -> number * number;
        System.out.println("Square "+square.process(10));

        NumberProcessor cube = ( number) -> number * number * number;
        System.out.println("Cube "+cube.process(10));

    }
}
