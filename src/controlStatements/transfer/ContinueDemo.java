package controlStatements.transfer;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i ==6) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");
    }
}
