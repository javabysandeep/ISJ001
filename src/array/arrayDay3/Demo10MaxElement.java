package array.arrayDay3;

public class Demo10MaxElement {
    public static void main(String[] args) {
        int[] array = {102, 20, 779, 68, 54, 87};
        int minimum = 2147483647;
        for (int arrayElement : array) {
            if (arrayElement < minimum) {
                minimum = arrayElement;
            }
        }
        System.out.println("Minimum element "+minimum);

    }
}
