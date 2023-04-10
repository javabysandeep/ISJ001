package classComponents.blocks;

public class Driver {
    //before java 7 it was not compulsory to have main method in the class to execute
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
}
