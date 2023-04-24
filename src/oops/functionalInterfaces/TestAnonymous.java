package oops.functionalInterfaces;

public class TestAnonymous {
    public static void main(String[] args) {
        Calc addition = new Calc() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };
        Calc subtraction = new Calc() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 - number2;
            }
        };
        Calc multiplication = new Calc() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 * number2;
            }
        };
        Calc division = new Calc() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 / number2;
            }
        };

        System.out.println("Addition " + addition.calculate(100, 200));
        System.out.println("Subtraction  " + subtraction.calculate(100, 200));
        System.out.println("Multiplication " + multiplication.calculate(100, 200));
        System.out.println("Division " + division.calculate(100, 200));
    }
}
