package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println(getInteger());
    }

    private static int getInteger() {
        try {
            return 1;
        } catch (Exception exception) {
            return 2;
        } finally {
            return 3;
        }
    }
}
