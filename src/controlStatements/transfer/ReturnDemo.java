package controlStatements.transfer;

public class ReturnDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i ==6) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");
    }
}
