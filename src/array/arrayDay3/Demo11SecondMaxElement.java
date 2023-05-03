package array.arrayDay3;

public class Demo11SecondMaxElement {
    public static void main(String[] args) {
        int[] array = {102, 20, 779, 68, 54, 87};
        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE - 1;
        for (int arrayElement : array) {
            if (arrayElement > maximum) {
                secondMaximum = maximum;
                maximum = arrayElement;
            }
            if (arrayElement < maximum && arrayElement > secondMaximum) {
                secondMaximum = arrayElement;
            }
        }
        System.out.println("Maximum element " + maximum);
        System.out.println("Second Maximum element " + secondMaximum);

    }
}
