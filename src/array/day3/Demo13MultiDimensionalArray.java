package array.day3;

public class Demo13MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {},
                {}
        };
        for (int[] memberArray:array) {
            System.out.println(memberArray);
        }

        int[][] array2 = {
                {10,30,20},
                {60,80},
                {110,120,56,78}
        };
        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                System.out.print(array2[row][column]+" ");
            }
            System.out.println();
        }
    }
}
