package wrapperClasses;

public class Demo1 {
    public static void main(String[] args) {
        byte bytePrimitiveValue = 120;

        //wrapping
        Byte byteObjectFormatValue = new Byte(bytePrimitiveValue);
        System.out.println(byteObjectFormatValue);

     // Unwrapping: convert byte object format into different number primitives types
        byte b = byteObjectFormatValue.byteValue();
        short shortValue = byteObjectFormatValue.shortValue();
        int intValue = byteObjectFormatValue.intValue();
        long longValue = byteObjectFormatValue.longValue();
        float floatValue = byteObjectFormatValue.floatValue();
        double doubleValue = byteObjectFormatValue.doubleValue();

        String number = "123";
        byte bytePrimitiveFromString = Byte.parseByte(number);//converts this string into byte primitive value.
        Byte byteObjectFromString = Byte.valueOf(number);//converts this string into byte primitive value.
    }
}
