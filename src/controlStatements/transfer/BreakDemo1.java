package controlStatements.transfer;

public class BreakDemo1 {
    public static void main(String[] args) {
        //break;  cannot be used outside of the loop or switch
        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");
    }
}
