package classComponents.variables;

public class A {
    static int a = 100;

    public static void main(String[] args) {
        System.out.println(A.a);//ClassName.staticVariableName
        System.out.println(a);
        A a = new A();
        System.out.println(a.a);
        //Output:
        //100
        //100
        //100
    }
}
