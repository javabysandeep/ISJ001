package operators;

public class EllipsisOperator {
    public static void main(String[] args) {
        display(10);
        display(10, 20);
        display(10, 20, 30);
        display(10, 20, 30, 40);
    }


    private static void display(int... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }

}