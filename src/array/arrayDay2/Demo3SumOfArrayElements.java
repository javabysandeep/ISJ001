package array.arrayDay2;

public class Demo3SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 23, 15};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        System.out.println("Sum of array elements in a given array "+sum);
    }
}
