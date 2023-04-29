package oops.objectClassDemos;

public class FinalizeDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method");
    }

    public static void main(String[] args) throws Throwable {
        FinalizeDemo demo = new FinalizeDemo();
        //finalize will be called by a program called as garbage collector part JDK
        //gc frees the unused memory at regular intervals.
        //unused: an object which is not referred by anyone.
        //demo = null;
        demo = new FinalizeDemo();


        // call to the garbage collector explicit
        System.gc();


    }
}
