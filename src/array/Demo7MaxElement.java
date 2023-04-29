package array;

public class Demo7MaxElement {
    public static void main(String[] args) {
        int[] array = {-796,-10,-45,-32,-55,-12,-796, -899};
        int max = array[0];//Integer.MIN
        for (int index = 0; index < array.length; index++) {
            if(array[index] > max){
                max = array[index];
            }
        }
        System.out.println("Maximum "+max);
    }
}
