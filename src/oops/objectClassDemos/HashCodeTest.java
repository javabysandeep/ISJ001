package oops.objectClassDemos;

public class HashCodeTest {
    public static void main(String[] args) {
        HashCodeTest hashCodeTest = new HashCodeTest();
        System.out.println(hashCodeTest.hashCode());
        HashCodeTest hashCodeTest2 = new HashCodeTest();
        System.out.println(hashCodeTest2.hashCode());

        hashCodeTest = hashCodeTest2;
        System.out.println(hashCodeTest.hashCode()+"\t"+hashCodeTest2.hashCode());

        HashCodeTest ref1 = new HashCodeTest();
        HashCodeTest ref2 = new HashCodeTest();
        //ref1=ref2;
        System.out.println(ref1.equals(ref2));//true
        System.out.println("hashcodes "+ref1.hashCode()+"\t"+ref2.hashCode());
    }
}
