package array.day3;

public class Demo7LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 77, 68, 54, 87};
        int key = 54;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                System.out.println("Element found at index " + index);
                break;
            }
        }

    }
}
