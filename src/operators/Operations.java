package operators;

public class Operations{
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 3;
        
        int addition = number1 + number2;
        System.out.println("Addition "+addition);
        
        int substraction = number1 - number2;
        System.out.println("substraction "+substraction);

        int multiplication = number1 * number2;
        System.out.println("multiplication "+multiplication);

        //Quotient = 33
        int division = number1 / number2;//quotient
        System.out.println("Division : Quotient "+division);

        //remainder = 1
        int remainder = number1 % number2; //remainder = 1
        System.out.println("Division : Remainder "+remainder);


    }   
}