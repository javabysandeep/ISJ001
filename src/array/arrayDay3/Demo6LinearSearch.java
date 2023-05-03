package array.arrayDay3;

public class Demo6LinearSearch {
    public static void main(String[] args) {
        int[] array = {10,20,77,68,54,87};
        int key = 54;
        for (int temp:array) {
            if(temp==key){
                System.out.println("Element found");
                break;
            }
        }

    }
}
