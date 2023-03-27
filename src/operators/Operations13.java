package operators;

public class Operations13 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int m = ++a;//m=2, a=2
        int n = b++;//n = 2,b=3
        int o = --c;//o=2,c=2
        int p = d++;//p=4,d=5

        System.out.println(a);//2
        System.out.println(b);//3
        System.out.println(c);//2
        System.out.println(d);//5
        System.out.println(m);//2
        System.out.println(n);//2
        System.out.println(o);//2
        System.out.println(p);//4
        System.out.println(a+b+c+d+m+n+o+p);//22

        

    }
}