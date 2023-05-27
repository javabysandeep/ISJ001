package collectionFramework.setImplementations;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo7HashSetCustomObjects {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        //to check uniqueness it uses equals and hashcode method

        Product product1 = new Product(101, "Laptop", 97000);
        Product product2 = new Product(1, "Mobile", 10000);
        Product product3 = new Product(11, "Charger", 1000);
        Product product4 = new Product(21, "Cables", 100);
        Product product5 = new Product(31, "Camera", 100000);
        Product product6 = new Product(9, "Ipad", 80000);
        Product product7 = new Product(9, "Ipad", 80000);
        Product product8 = new Product(9, "Ipad", 80000);
        Product product9 = new Product(9, "Ipad", 80000);
        Product product10 = new Product(9, "Ipad", 80000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        System.out.println("size of Hashset is "+products.size());
        products.forEach(System.out::println);
    }
}
