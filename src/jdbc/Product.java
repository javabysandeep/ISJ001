package jdbc;

public class Product implements Cloneable{
    int productId;
    String productName;
    int productPrice;

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(Product product){
        this.productId = product.productId;
        this.productName = product.productName;
        this.productPrice = product.productPrice;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
