package exceptionHandling;

import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18){
            throw new InvalidAgeException("Under age");
        }else{
            System.out.println("You are eligible to vote");
        }
    }
}
