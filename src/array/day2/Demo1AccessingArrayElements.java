package array.day2;

public class Demo1AccessingArrayElements {
    public static void main(String[] args) {
        int[] array = new int[5];//array is created with 5 elements and all elements are initialized with default value zero
        System.out.println("Size of array " + array.length);

        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("Size of an array " + array2.length);

        System.out.println(array2[0]);//1
        System.out.println(array2[1]);//2
        System.out.println(array2[2]);//3
        System.out.println(array2[3]);//4
        System.out.println(array2[4]);//5
        //System.out.println(array2[5]);//RTE: ArrayIndexOutOfBoundsException

        System.out.println("Accessing the array elements with the help of for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array2[index] + " ");
        }
    }

}
