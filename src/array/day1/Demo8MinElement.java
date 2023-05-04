package array.day1;

public class Demo8MinElement {
    public static void main(String[] args) {
        int[] array = {-796,-10,-45,-32,-55,-12,-796, -899};
        int minimum = array[0];//Integer.MIN
        for (int index = 0; index < array.length; index++) {
            if(array[index] < minimum){
                minimum = array[index];
            }
        }
        System.out.println("Minimum "+minimum);
    }
}
