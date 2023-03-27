package operators;

public class ConditionalOperator1 {
    public static void main(String[] args) {
        System.out.println(
                10 < 2 ? "true statement" : "false statement");
        int number = 20;
        System.out.println(number % 2 == 0 ? "Its even number" : "Its a odd number");

        int a = 100;
        int b = 200;
        System.out.println(a > b ? a : b);
    }
}