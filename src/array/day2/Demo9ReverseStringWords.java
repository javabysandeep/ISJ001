package array.day2;

public class Demo9ReverseStringWords {
    public static void main(String[] args) {

        String str = "welcome to IT Shaala";
        //reverse the array content
        String[] array = str.split(" ");

        int left = 0;
        int right  = array.length-1;
        while (left < right){
            String temp = array[left];
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
