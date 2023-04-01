package classComponents.variables;

public class Product {
    int productId;
    String productName;
    int productPrice;
    static String companyName = "ITC";

    public static void main(String[] args) {
        Product product = new Product();// created an object of type Product
        System.out.println(product.productId);//0
        System.out.println(product.productName);//null
        System.out.println(product.productPrice);//0

        product = null;
        System.out.println(Product.companyName);
        System.out.println(companyName);//this will work when we are accessing the variable from the same class

    }
}
