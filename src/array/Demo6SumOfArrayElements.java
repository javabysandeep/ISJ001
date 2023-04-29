package array;

public class Demo6SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10,45,32,55,12,76};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        System.out.println("Sum of array elements "+sum);


    }
}
