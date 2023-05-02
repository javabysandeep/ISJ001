package array.arrayDay2;

public class Demo12 {
    public static void main(String[] args) {
       int[][]  array = new int[2][2];
        System.out.println(array[0]);
        System.out.println(array[1]);

        System.out.println("Accessing the member array elements");
        System.out.println(array[0][0]);//0
        System.out.println(array[0][1]);//0
        System.out.println(array[1][0]);//0
        System.out.println(array[1][1]);//0
        System.out.println("accessing the, using for loop");

        for (int row = 0; row < array.length; row++) {
            for (int colum = 0; colum < array[row].length; colum++) {
                System.out.print(array[row][colum]+" ");
            }
            System.out.println();
        }


    }
}
