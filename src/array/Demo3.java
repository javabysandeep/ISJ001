package array;

public class Demo3 {
    public static void main(String[] args) {
        int[] array = new int[0];
        System.out.println("Size of given array "+array.length);

        int[] array2 = {};
        System.out.println("Size of given array "+array2.length);

        //accessing the array elements
        //System.out.println("Element "+array2[0]);


        int[] array3 = {10,20,30};
        System.out.println("First element "+array3[0]);
        System.out.println("Second element "+array3[1]);
        System.out.println("Third element "+array3[2]);

        //index range 0 to 2
        //System.out.println("Fourth element "+array3[3]);

    }
}
