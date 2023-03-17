public class BitwiseOperators1 {
    public static void main(String[] args) {
        //&, |, ^ are both logical and bitwise operators
        // Bitwise operators : &, |, ^, <<, >>, ~
        
        // unary operators : ~
        //binary operators : &, |, ^, <<, >>

        System.out.println(4 & 5);//4
        //4 --> 1 0 0
        //5 --> 1 0 1
        //4  <-- 1 0 0

        System.out.println(4 | 5);//5
        //4 --> 1 0 0
        //5 --> 1 0 1
        //5 <-- 1 0 1


        System.out.println(4 ^ 5);//1
        //4 --> 1 0 0
        //5 --> 1 0 1
        //1 <-- 0 0 1


        System.out.println(4 << 1);
        
        System.out.println(4 >> 1);//2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        System.out.println(4 >> 4);//0
        // 100 --> 10 --> 2
        //100 --> 1 --> 1
        //100 --> 0 
    }
}