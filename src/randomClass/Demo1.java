package randomClass;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            System.out.println(random.nextInt());
        }
    }
}
