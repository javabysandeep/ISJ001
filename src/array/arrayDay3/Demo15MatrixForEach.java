package array.arrayDay3;

import java.util.Scanner;

public class Demo15MatrixForEach {
    public static void main(String[] args) {
        int[][] matrix = acceptMatrix();
        System.out.println("Printing the accepted matrix");
        printMatrix(matrix);
        int[][] transpose = transpose(matrix);
        System.out.println("Printing the transpose matrix");
        printMatrix(transpose);
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[row][column] = matrix[column][row];
            }
        }
        return  transpose;
    }

    public static int[][] acceptMatrix() {
        System.out.println("Enter the no.of rows and no. of columns");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
