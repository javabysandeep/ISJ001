package classComponents.blocks;

public class DriverTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. to load the class in the memory we can create the object of that class.
        Driver driver = new Driver();

        //2. to load the class we can use Class.forName("className");
        //this method will only load the class not create the object.
        //Class.forName("classComponents.blocks.Driver");//ClassNotFoundException
    }
}
