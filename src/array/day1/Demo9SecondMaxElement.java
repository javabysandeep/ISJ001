package array.day1;

public class Demo9SecondMaxElement {
    public static void main(String[] args) {
        int[] array = {10,20,30,15,40,39};
        int max = Integer.MIN_VALUE;//899
        int secondMax = Integer.MIN_VALUE;//-10

        for (int index = 0; index < array.length; index++) {
            if(array[index] > max){
                secondMax = max;
                max = array[index];
            }
            if(array[index] < max && array[index]>secondMax ){
                secondMax = array[index];
            }


        }

        System.out.println("Maximum "+max);
        System.out.println("Second Maximum "+secondMax);
    }
}
