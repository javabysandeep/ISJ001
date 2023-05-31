package genericCode;

public class ElipsisOperator {
    public static void main(String[] args) {
        System.out.println(add(100, 200, 300,400));
    }

    private static int add(int... input) {
        int sum = 0;
        for (int number : input) {
            sum += number;
        }
        return sum;
    }
}
