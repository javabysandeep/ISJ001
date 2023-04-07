package classComponents.nestedClasses;

public class P {
    static class Q{
        static class R{
            static class S{
                static String username ="secret static value";
                String password ="secret instance value";
            }
        }
    }
}
