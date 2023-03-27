package introduction;

public class DataTypeDemo3 {
    public static void main(String[] args) {
        //Typecasting: It is a process of converting one datatype value to anoter data type value.
        //There are two types of typecasting:
            //1. implicit or automatic:
                // - when we try to convert smaller data type value to a bigger data type value
                // it is done by compliler automatically.
                // there will not be any data loss.
                
            //2. explict typecasting
                // - when we try to convert bigger data type value to a smaller data type value
                // it is done by developer explicitly.
                // there will be a  chance of data loss.

        byte byteValue = 127;
        short shortValue = byteValue;//implicit typecasting

        int integerValue  = 130;
        byte b = (byte)integerValue;//explicit typecasting
        System.out.println(b);
    }
}