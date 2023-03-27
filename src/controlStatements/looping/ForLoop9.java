package controlStatements.looping;

public class ForLoop9 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            //calculate sum of 1 to n number
            //sum = sum +i;
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of 1 to 10000[only even numbers] is : " + sum);
    }
}
