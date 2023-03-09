public class DataTypeDemo {
    public static void main(String[] args) {
        // byte(1), short(2), int(4), long(8) :  whole numbers
        // float(4), double(8) : decimal or real numbers  or floating numbers
        //to store character data : char(2)
        // to store boolean true or false : boolean(1)

        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147148;
        long number4 = 568888888L;
        float number5 = 1678.90F;
        double number6 = 6788999.89D;
        char character = 'A';
        boolean booleanValue = true;
        
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(character);
        System.out.println(booleanValue);
    }
}