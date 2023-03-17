public class Operations14 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a++ - ++b + ++a + a-- + c++ - --c + ++d);
                        //1 - 3 + 3 + 3 + 3 - 3 + 5=9
        System.out.println(a);//2
        System.out.println(b);//3
        System.out.println(c);//3
        System.out.println(d);//5
        
        

        

    }
}