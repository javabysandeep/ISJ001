package controlStatements.looping;

public class ForLoop8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            //calculate sum of 1 to n number
            //sum = sum +i;
            sum +=i;
        }
        System.out.println("Sum of 1 to 10000 is : "+sum);
    }
}
