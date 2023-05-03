package array.arrayDay3;

public class Demo9MaxElement {
    public static void main(String[] args) {
        int[] array = {102, 20, 779, 68, 54, 87};
        int maximum = Integer.MIN_VALUE;
        for (int arrayElement : array) {
            if (arrayElement > maximum) {
                maximum = arrayElement;
            }
        }
        System.out.println("Maximum element "+maximum);

    }
}
