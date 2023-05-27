package operators;

public class EllipsisOperatorAddition {
    public static void main(String[] args) {
        System.out.println(add(100,200));
        System.out.println(add(100,300,200));
        System.out.println(add(100,300,200,400));
    }


    private static int add(int... array) {
        int add = 0;
        for (int i = 0; i < array.length; i++) {
            add += array[i];
        }
        return add;
    }

}