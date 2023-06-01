package jdbc;

public class ClassLoading {
    public static void main(String[] args) {
        //just execute static block of Parent class
        // to execute the static block of class it has to be loaded in the memory.

        // how to load class in the memory?
        //1. whenever we try to create the object of a class, first class will be loaded

        // Parent parent = new Parent();//static block, instance block, constructor
        // drawbacks of this way of class loading:
        // sometimes we don't know the constructor availability
        // unnecessary execution of constructor and instance block which can lead to impact on the application
        // because of the there might be some exceptions

        //2. Load the class in the memory with the help of Class.forName(classNameAlongWithPackageName);
        try {
            Class.forName("jdbc.Parent");//checked exceptions : ClassNotFoundException
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Class not found " + classNotFoundException.getMessage());
        }

        // we only load the class in the memory
        // we avoid unnecessary object creation, constructor call, instance block execution

    }
}
