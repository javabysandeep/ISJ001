package controlStatements.looping;

public class ForLoop10 {
    public static void main(String[] args) {
        //find the factors of a given number
        // 10: 1,2,5,
        //6 : 1, 2,3
        //100: 1, 2,4, 5, 10, 20, 25, 50
        //1000: 1,2,4,5,10,20,25, 50, 100, 200, 250,500
        int number = 100;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
