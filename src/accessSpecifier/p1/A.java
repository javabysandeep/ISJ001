package accessSpecifier.p1;

import java.util.ArrayList;

public class A {
    public int p = 100;
    private int q = 200;
    protected int r = 300;
    int s = 400;
    void m1(){
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
