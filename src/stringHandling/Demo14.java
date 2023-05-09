package stringHandling;

public class Demo14 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc");

        //length
        System.out.println("Length "+stringBuffer.length());//3


        //capacity
        System.out.println("Capacity "+stringBuffer.capacity());

        String str1 = "A";
        String str2 = "A";
        System.out.println(str1.compareTo(str2));//0

        System.out.println(str1.equals(str2));//true
        System.out.println(str1==str2);//true
    }

}
