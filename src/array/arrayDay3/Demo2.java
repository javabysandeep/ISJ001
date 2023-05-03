package array.arrayDay3;

public class Demo2 {
    public static void main(String[] args) {
        //array with zero size
        int[] array1 = {};
        int[] array2 = new int[0];
        System.out.println(array1.length);
        System.out.println(array2.length);

       // int[] array3 = new int[-20];//RTE : NegativeArraySizeException
        //int[] array4 = new int[10.5f];
        //int[] array4 = new int[10000L];
        int[] array5 = new int['A'];

    }
}
