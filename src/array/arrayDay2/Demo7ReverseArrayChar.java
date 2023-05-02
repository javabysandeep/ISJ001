package array.arrayDay2;

public class Demo7ReverseArrayChar {
    public static void main(String[] args) {
        //reverse the array content
        char[] array = {'A','B','C','D'};

        int left = 0;
        int right  = array.length-1;
        while (left < right){
            char temp = array[left];
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
