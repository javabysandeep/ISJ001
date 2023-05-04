package array.day2;

public class Demo2EveNumbers {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 23, 15};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                System.out.println(array[index]);
            }
        }
    }
}
