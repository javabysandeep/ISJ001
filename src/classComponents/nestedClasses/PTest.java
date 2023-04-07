package classComponents.nestedClasses;

public class PTest {
    public static void main(String[] args) {
        System.out.println(P.Q.R.S.username);

        P.Q.R.S s = new P.Q.R.S();
        System.out.println(s.password);
    }
}
