package array.arrayDay3;

public class Demo5 {
    public static void main(String[] args) {
        int[] integerArray = new int[5];
        System.out.println("Before");
        for (int j : integerArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        integerArray[0] = 10;
        integerArray[1] = 20;
        integerArray[2] = 30;
        integerArray[3] = 40;
        integerArray[4] = 50;
        System.out.println("After");
        for (int intValue : integerArray) {
            System.out.print(intValue + " ");
        }
    }
}
