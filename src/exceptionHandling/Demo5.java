package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try{
            System.out.println("**");
            System.out.println("**");
            System.exit(0);
        }catch (Exception ex){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        System.out.println("**");
        System.out.println("**");
        System.out.println("**");
    }
}
