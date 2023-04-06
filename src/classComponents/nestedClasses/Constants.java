package classComponents.nestedClasses;

public class Constants {
    static int a = 100;
    static void m1(){
        System.out.println("static method");
    }
    static class Mysql{
        static String username = "admin";
        static String password = "admin@123";
    }

    public static void main(String[] args) {
        //ClassName.staticMember
        System.out.println(Constants.a);
        Constants.m1();

        System.out.println(Constants.Mysql.username);
        System.out.println(Constants.Mysql.password);
        Mysql mysql = new Constants.Mysql();

    }
}
