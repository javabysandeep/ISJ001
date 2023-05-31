package wrapperClasses;

public class Demo3 {
    public static void main(String[] args) {
        boolean booleanPrimitiveValue = true;
        Boolean aBoolean = new Boolean(booleanPrimitiveValue);
        Boolean booleanString = new Boolean("true");
        boolean aTrue = Boolean.parseBoolean("true");
        Boolean aBoolean1 = Boolean.valueOf("false");
        System.out.println(Boolean.logicalAnd(true,true));//true
        System.out.println(Boolean.logicalOr(true,true));//true
        System.out.println(Boolean.logicalXor(true,true));//false
    }
}
