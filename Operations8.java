public class Operations8 {
    public static void main(String[] args) {
        System.out.println(1/10);//0
        System.out.println(1.0f/10);//0.1

        System.out.println(100/10);//10
        System.out.println(10/1);//10
        
        System.out.println(100.0f/10);//10.0
        System.out.println(10.0f/1);//10.0

        System.out.println(1%10);//1
        System.out.println(1.5f%10);//1.5

        System.out.println(0/1);//0
        System.out.println(0.0/1);//0.0
        System.out.println(1.0/0);//Infinity
        System.out.println(1.0 % 0);//NaN
        System.out.println(1/0);//ArithmeticException divide by zero
        
        
    }
}