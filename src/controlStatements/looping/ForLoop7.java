package controlStatements.looping;

public class ForLoop7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //print only odd numbers
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
