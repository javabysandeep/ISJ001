package array.day3;

public class Demo12SecondMinElement {
    public static void main(String[] args) {
        int[] array = {102, 20, 779, 68, 54, 87};
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE - 1;
        for (int arrayElement : array) {
            if (arrayElement < minimum) {
                secondMinimum = minimum;
                minimum = arrayElement;
            }
            if (arrayElement > minimum && arrayElement < secondMinimum) {
                secondMinimum = arrayElement;
            }
        }
        System.out.println("Minimum element " + minimum);
        System.out.println("Second Minimum element " + secondMinimum);

    }
}
