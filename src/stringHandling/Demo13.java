package stringHandling;

public class Demo13 {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder s2 = new StringBuilder("xyz");
        StringBuffer s3 = new StringBuffer("pqr");

        // string --> stringBuffer
        StringBuffer stringBuffer = new StringBuffer(s1);

        // string --> stringBuilder
        StringBuilder stringBuilder = new StringBuilder(s1);

        //StringBuilder --> String
        String string = new String(s2);

        //StringBuilder --> StringBuffer
        StringBuffer stringBuffer1 = new StringBuffer(stringBuilder);

        //StringBuffer --> String
        String string1 = new String(stringBuffer);

        //StringBuffer --> StringBuilder

        // pass that as constructor parameter.
    }
}
