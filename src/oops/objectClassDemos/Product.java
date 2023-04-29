package oops.objectClassDemos;

import java.util.Objects;

public class Product {
    int id;
    String productName;

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName);
    }
}
