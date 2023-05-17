package fileHandling;

import java.io.*;

public class Demo23DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("product.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
        Product product = (fileHandling.Product) objectInputStream.readObject();
        System.out.println(product);
    }
}
