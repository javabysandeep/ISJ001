package classComponents.constructors.copyConstructor;

public class Product {
    int productId;
    String productName;
    String productDescription;

    Product(int pId, String pName, String pDescription){
        productId = pId;
        productName = pName;
        productDescription = pDescription;
    }

    //copy constructor
    public Product(Product product) {
        productId = product.productId;
        productName = product.productName;
        productDescription= product.productDescription;
    }

    public static void main(String[] args) {
        Product product = new Product(101, "Camera","Its PTZ camera");
        Product product2 = new Product(product);
    }

}
