package array.day2;

public class Demo10Matrix {
    public static void main(String[] args) {
        int[][] array = {
                {10,20,30},
                {11,22,33,44},
                {1,2,3,4}
        };
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println("Size of outer array "+array.length);
        System.out.println("Size of first inner array "+array[0].length);
        System.out.println("Size of second inner array "+array[1].length);
    }
}
