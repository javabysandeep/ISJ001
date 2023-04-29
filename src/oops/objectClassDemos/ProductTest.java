package oops.objectClassDemos;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product(1,"mobile");
        Product product2 = new Product(1,"mobile");
        Product product3 = new Product(1,"mobile");
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));
        System.out.println(product1.equals(product1));
        Student student = new Student(1,"abc");
        System.out.println(product1.equals(student));//false
        System.out.println(product1.equals(null));//false
    }
}
