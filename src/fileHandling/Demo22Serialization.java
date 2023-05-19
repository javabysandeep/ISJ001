package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo22Serialization {
    public static void main(String[] args) throws IOException {
        Product product = new Product(101,"laptop",37000);
        File file = new File("product.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);
        System.out.println("Object Saved successfully");
    }
}
