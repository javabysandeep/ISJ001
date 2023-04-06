package classComponents.thisKeyword;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //no-args constructor  or zero param1
    public Product() {
    }

    // all args constructor : it initializes all the instance variables of the given class
    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop",150000);
        Product product2 = new Product(2,"Mobile",70000);

    }
}
