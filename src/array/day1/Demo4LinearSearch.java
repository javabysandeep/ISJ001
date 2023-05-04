package array.day1;

public class Demo4LinearSearch {
    public static void main(String[] args) {
        int[] array = {10,45,32,55,12,76};
        int key = 12;

        for (int index = 0; index < array.length; index++) {
            if(key==array[index]){
                System.out.println("Key found at index "+index);
                break;
            }
        }

    }
}
