package controlStatements;

public class Pattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row=row+2) {
            //spaces
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            //numbers
            for (int column = 7, i = 1; column >=row; column--, i++) {
                System.out.print(i % 2 != 0 ? " 1 " : " 0 ");
            }
            System.out.println();
        }
    }
}
