package jdbc;

abstract public class ProductService {
    abstract void show();

    public static void main(String[] args) {
        ProductService productService = new ProductService() {
            @Override
            void show() {
                System.out.println("show");
            }
        };
        productService.show();
    }
}
