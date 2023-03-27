package controlStatements.looping;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sumOfDigits = 0;
        while(number > 0){
            int digit = number % 10;
//            sumOfDigits = sumOfDigits + digit;
            sumOfDigits +=digit;
            number = number/10;
        }
        System.out.println("Sum of digits  "+sumOfDigits);
    }
}
