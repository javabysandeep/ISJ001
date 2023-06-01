package jdbc;

public class ProductCloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product1 = new Product(1,"Laptop",100);
       // Product product2 = (Product)product1.clone();

        Product product2 = new Product(product1);

        System.out.println(product1);
        System.out.println(product2);

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

    }
}
