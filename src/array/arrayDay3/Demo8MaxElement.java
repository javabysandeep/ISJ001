package array.arrayDay3;

public class Demo8MaxElement {
    public static void main(String[] args) {
        int[] array = {102, 20, 779, 68, 54, 87};
        int maximum = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
           if(array[index] > maximum){
               maximum = array[index];
           }
        }
        System.out.println("Maximum element "+maximum);

    }
}
