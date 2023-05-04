package array.day2;

public class Demo4CopyArray {
    public static void main(String[] args) {
        int[] oldArray = {10, 11, 12, 23, 15};
        int[] newArray = new int[oldArray.length];
        for (int index = 0; index < oldArray.length; index++) {
            newArray[index] = oldArray[index];
        }
        //print content of array
        System.out.println("Printing the content of new array");
        for (int index = 0; index < newArray.length; index++) {
            System.out.print(newArray[index]+" ");
        }
    }
}
