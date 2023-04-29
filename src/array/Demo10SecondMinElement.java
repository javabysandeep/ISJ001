package array;

public class Demo10SecondMinElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 15, 40, 39};
        int minValue = Integer.MAX_VALUE;//899
        int secondMin = Integer.MAX_VALUE;//-10

        for (int index = 0; index < array.length; index++) {
            if (array[index] < minValue) {
                secondMin = minValue;
                minValue = array[index];
            }
            if (array[index] > minValue && array[index] < secondMin) {
                secondMin = array[index];
            }


        }

        System.out.println("Minimum " + minValue);
        System.out.println("Second Minimum " + secondMin);
    }
}
