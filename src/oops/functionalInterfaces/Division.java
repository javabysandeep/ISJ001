package oops.functionalInterfaces;

public class Division implements Calc{
    @Override
    public int calculate(int number1, int number2) {
        return number1/number2;
    }
}
