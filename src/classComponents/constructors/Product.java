package classComponents.constructors;

public class Product {
    int productId;//iv
    String productName;//iv

    //zero param con
    Product(){

    }
    //param
    Product(int pId, String pName){
        //pid, pName are local variables
        productId = pId;
        productName = pName;
    }
    //copy constructor
    Product(Product p){
        productId = p.productId;
        productName = p.productName;
    }

    public static void main(String[] args) {
        Product product1 = new Product();//zero param
        Product product2 = new Product(1,"Mobile");//two param
        Product product3 = new Product(product2);
        System.out.println("Product1 "+product1.productId+"\t"+product1.productName);
        System.out.println("Product2 "+product2.productId+"\t"+product2.productName);
        System.out.println("Product3 "+product3.productId+"\t"+product3.productName);
    }
}
