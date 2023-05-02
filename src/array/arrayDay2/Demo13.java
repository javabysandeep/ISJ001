package array.arrayDay2;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows and columns");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        //accept the matrix
        System.out.println("Enter the matrix elements");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }

        //print the matrix details
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
