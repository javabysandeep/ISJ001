package controlStatements.looping;

public class ForLoop11 {
    public static void main(String[] args) {
        //Perfect number : when sum of factors = number itself
        //find the factors of a given number
        // 10: 1,2,5,
        //6 : 1, 2,3
        //100: 1, 2,4, 5, 10, 20, 25, 50
        //1000: 1,2,4,5,10,20,25, 50, 100, 200, 250,500
        int number = 6;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println((sum == number) ? "Its perfect number" : "Not a perfect number");
    }
}
