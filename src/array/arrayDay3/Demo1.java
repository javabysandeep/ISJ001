package array.arrayDay3;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        //accessing the elements one by one
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        //System.out.println(array[5]);//ArrayIndexOutOfBoundsException

        //access the elements with the help of for loop
        System.out.println("Accessing the array elements with for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

    }
}
