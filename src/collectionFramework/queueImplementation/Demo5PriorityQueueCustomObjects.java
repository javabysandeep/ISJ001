package collectionFramework.queueImplementation;

import collectionFramework.setImplementations.Product;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Demo5PriorityQueueCustomObjects {
    public static void main(String[] args) {
        Queue<Product> products = new PriorityQueue<>((p1,p2)->p1.getProductId()-p2.getProductId());

        Product product1 = new Product(101, "Laptop", 97000);
        Product product2 = new Product(1, "Mobile", 10000);
        Product product3 = new Product(11, "Charger", 1000);
        Product product4 = new Product(21, "Cables", 100);
        Product product5 = new Product(31, "Camera", 100000);
        Product product6 = new Product(9, "Ipad", 80000);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);

        int size = products.size();
        for (int i = 1; i <=size ; i++) {
            System.out.println(products.poll());
        }

    }
}
