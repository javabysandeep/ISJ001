package classComponents.variables;

public class BTest {
    public static void main(String[] args) {
        // ClassName.staticVariableName
        System.out.println(B.staticVariable);



        B referenceVariable = new B();
        //referenceVariable.staticVariableName
        System.out.println(referenceVariable.staticVariable);

    }
}
