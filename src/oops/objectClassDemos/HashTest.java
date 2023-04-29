package oops.objectClassDemos;

public class HashTest {
    public static void main(String[] args) {
        int number = 100;
        //binary
        System.out.println("Binary "+Integer.toBinaryString(number));
        //octal
        System.out.println("Octal "+Integer.toOctalString(number));
        //hexadecimal
        System.out.println("Hexadecimal "+Integer.toHexString(number));

        HashTest hashTest = new HashTest();
        System.out.println(hashTest.getClass().getName()+"@"+Integer.toHexString(hashTest.hashCode()));
        System.out.println(hashTest.toString());
    }
}
