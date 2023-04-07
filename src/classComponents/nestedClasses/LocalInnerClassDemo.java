package classComponents.nestedClasses;

public class LocalInnerClassDemo {
    {
        class Local{
            //we can only write non-static members
        }
    }
    static {
        class Local{
            //we can only write non-static members
        }
    }
    LocalInnerClassDemo(){
        class Local{
            //we can only write non-static members
        }
    }
    public static void main(String[] args) {
        class Local{
            //we can only write non-static members
        }
    }
}
