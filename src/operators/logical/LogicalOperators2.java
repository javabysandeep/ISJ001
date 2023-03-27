package operators.logical;

public class LogicalOperators2 {
    public static void main(String[] args) {
        //find the maximum of three numbers
        int number1 = 67;
        int number2 = 57;
        int number3 = 97;

        System.out.println( (number1 > number2) && (number1 > number3));//false
        System.out.println( (number2 > number1) && (number2 > number3));//false
        System.out.println( (number3 > number1) && (number3 > number2));//true


        System.out.println( (number1 > number2) || (number1 > number3));//true
        System.out.println( (number2 > number1) || (number2 > number3));//false
        System.out.println( (number3 > number1) || (number3 > number2));//true

        System.out.println( (number1 > number2) ^ (number1 > number3));//true
        System.out.println( (number2 > number1) ^ (number2 > number3));//false
        System.out.println( (number3 > number1) ^ (number3 > number2));//false
    }
}