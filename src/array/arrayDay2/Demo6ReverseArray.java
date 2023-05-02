package array.arrayDay2;

public class Demo6ReverseArray {
    public static void main(String[] args) {
        //reverse the array content
        int[] array = {100, 87, 102, 67, 134, 8};

        int left = 0;
        int right  = array.length-1;
        while (left < right){
            int temp = array[left];
            array[left]= array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]+" ");
        }


        /*//just printing the array elements
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }*/
    }
}
