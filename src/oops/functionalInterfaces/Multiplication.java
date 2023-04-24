package oops.functionalInterfaces;

public class Multiplication implements Calc{
    @Override
    public int calculate(int number1, int number2) {
        return number1*number2;
    }
}
