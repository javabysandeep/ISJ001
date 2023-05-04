package array.day3;

public class Demo12Reverse {
    public static void main(String[] args) {
        int[] array = {102, 20, 779, 68, 54, 87};
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int temp:array) {
            System.out.print(temp+" ");
        }

    }
}
