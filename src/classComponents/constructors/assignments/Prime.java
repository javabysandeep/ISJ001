package classComponents.constructors.assignments;

import java.util.Scanner;

public class Prime {
    static void primeFactors(int number) {
        //find factors
        for (int i = 1; i <=number/2 ; i++) {
            if(number%i==0){
                //i is factor then check i is prime or not
                if (isPrime(i)){
                    System.out.println("Prime factor of given number is "+i);
                }
            }
        }
    }

    static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        primeFactors(number);
    }
}
