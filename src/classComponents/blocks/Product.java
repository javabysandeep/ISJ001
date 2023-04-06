package classComponents.blocks;

public class Product {

    public Product() {
        this(10,20);
        System.out.println("zero param");
    }
    public Product(int a, int b) {
        //this();
        System.out.println(" param con");
    }

    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Product product = new Product();
        //this();
    }
    void m1(){

        //this();
    }
}
