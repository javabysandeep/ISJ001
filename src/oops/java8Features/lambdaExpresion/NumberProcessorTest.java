package oops.java8Features.lambdaExpresion;

public class NumberProcessorTest {
    public static void main(String[] args) {
        //implementations: int process(int number);
        //1. square
        //2. cube
        //3.

        NumberProcessor square = (number) -> number * number;
        System.out.println("Square " + square.process(15));

        NumberProcessor cube = (number) -> number * number * number;
        System.out.println("Cube " + cube.process(15));
    }
}
