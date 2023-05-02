package array.arrayDay2;

public class Demo5MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 11, 12, 23, 15};
        int[] array2 = {100, 110, 120, 230, 150};
        int[] mergedArray = new int[array1.length + array2.length];
        //copy the content of array1
        int indexOfMergedArray = 0;
        for (int index = 0; index < array1.length && indexOfMergedArray < mergedArray.length; index++, indexOfMergedArray++) {
            mergedArray[indexOfMergedArray] = array1[index];
        }

        //copy the content of array2
        for (int index = 0; index < array2.length && indexOfMergedArray < mergedArray.length; index++, indexOfMergedArray++) {
            mergedArray[indexOfMergedArray] = array2[index];
        }

        //print the content of merged array
        for (int index = 0; index < mergedArray.length; index++) {
            System.out.print(mergedArray[index]+" ");
        }
    }
}
