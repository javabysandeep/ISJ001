package array.day4;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];//3,2
        for (int rowMatrix = 0; rowMatrix < matrix.length; rowMatrix++) {
            for (int columnMatrix = 0; columnMatrix < matrix[rowMatrix].length; columnMatrix++) {
                transpose[columnMatrix][rowMatrix] = matrix[rowMatrix][columnMatrix];
            }
        }
        System.out.println("Printing the transpose ");
        for (int[] row:transpose) {
            for (int i:row) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
