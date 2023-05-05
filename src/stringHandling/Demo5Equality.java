package stringHandling;

public class Demo5Equality {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s3 = new String("abc");
        String s2 = new String("pqr");
        String s4 = new String("pqr");
        String s5 = "abc";
        String s8 = "abc";
        String s6 = "pqr";
        String s7 = "pqr";
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false
        System.out.println(s2==s4);//false
        System.out.println(s2==s3);//false
        System.out.println(s5==s1);//false
        System.out.println(s6==s4);//false
        System.out.println(s5==s8);//true
        System.out.println(s7==s6);//true

        //equals method is overriden inside the String class. It checks the content of the String class object
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s4));//true;
        System.out.println(s1.equals(s5));//true
        System.out.println(s3.equals(s8));//true


    }
}
