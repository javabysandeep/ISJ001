package array.day2;

public class Demo11Accessing {
    public static void main(String[] args) {
        int[][] array = {
                {10,20,30},
                {11,22,33,44},
                {1,2,3,4}
        };
        for (int index = 0; index < array.length; index++) {
            //print the content of member array
            for (int j = 0; j < array[index].length; j++) {
                System.out.print(array[index][j]+" ");
            }
            System.out.println();

        }

    }
}
