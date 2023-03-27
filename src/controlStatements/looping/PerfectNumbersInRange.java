package controlStatements.looping;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 10000; number++) {
            //check each number is perfect or not
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("Its perfect " + number);
            }
        }
    }
}
