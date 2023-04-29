package array;

public class Demo5EvenNumbers {
    public static void main(String[] args) {
        int[] array = {10,45,32,55,12,76};
        for (int index = 0; index < array.length; index++) {
            if(array[index]%2==0){
                System.out.println(array[index]);
            }
        }


    }
}
