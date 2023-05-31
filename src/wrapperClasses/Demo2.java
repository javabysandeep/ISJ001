package wrapperClasses;

public class Demo2 {
    public static void main(String[] args) {
        int intPrimitiveValue = 12345;
        Integer integerObjectValue = new Integer("123");
//        byte bytePrimitiveValue = 100;
        Integer integerObjectValue1 = new Integer(integerObjectValue);
        System.out.println(Integer.toBinaryString(127));
        System.out.println(Integer.toOctalString(127));
        System.out.println(Integer.toHexString(127));

        int i = Integer.parseInt("123");//string to primitive
        Integer integer = Integer.valueOf("123"); // string to object format
        System.out.println(i);
        System.out.println(integer);
    }
}
