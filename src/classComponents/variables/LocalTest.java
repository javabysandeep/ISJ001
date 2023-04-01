package classComponents.variables;

public class LocalTest {
    static int a = 100;//static variable
    int b = 2;//instance variable

    public static void main(String[] args) {
        int a = 200;
        System.out.println(a);//200- local variable
        System.out.println(LocalTest.a);//100

        int b = 300;
        System.out.println(b);//300

        LocalTest reference = new LocalTest();
        System.out.println(reference.b);//2
    }
}
