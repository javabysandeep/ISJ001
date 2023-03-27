package controlStatements.looping;

public class DoWhileDemo {
    public static void main(String[] args) {
        do{
            System.out.println("do executed");
        }
        //independent do is not allowed
        while (true);
    }
}
