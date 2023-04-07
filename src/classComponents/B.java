package classComponents;

public class B {
    int x;
    int y;

    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //copy constructor
    public B(B b){
        this.x = b.x;
        this.y = b.y;
    }

    public static void main(String[] args) {
        B b = new B(100,200);
        B b1 = new B(b);
    }
}
