package controlStatements.conditional;

public class IfElseDemo07 {
    public static void main(String[] args) {

        int year = 2020;

        if( (year%400==0) || ( year%100 !=0 && year%4==0) ){
            System.out.println("Its leap year "+year);
        } else{
            System.out.println("Its not a leap year "+year);
        }

        System.out.println(((year%400==0) || ( year%100 !=0 && year%4==0)) ?"leap":"not a leap");

    }
}