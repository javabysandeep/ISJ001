public class ConditionalOperator2 {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;
        int c = 300;

        System.out.println(
            (a > b && a > c)
            ? a
            :(
                (b > a && b > c) ? b : c
             )
        );
}
}