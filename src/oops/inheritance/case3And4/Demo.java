package oops.inheritance.case3And4;

public class Demo {
    public static void main(String[] args) {
        //1. parent class reference = parent class object
            // access from Only Parent class
        Parent parent = new Parent();
        System.out.println(parent.a);

        //2. child class reference = child class object
        Child child = new Child();
        System.out.println(child.a);//a is only present inside the parent class ---> Parent
        System.out.println(child.b);//b is only present child class ---? Child
        System.out.println(child.c);//c is present in both parent and child class ---> Child


        //3. parent class reference = child class object
        Parent parentReference = new Child();

        // only present in parent --->
        //a is only present inside the parent class ---> Parent
        System.out.println(parentReference.a);//


        // only present in child
        //b is only present child class ---? Child
        //System.out.println(parentReference.b);//CTE

        // present in both parent and child
        //c is present in both parent and child class
        System.out.println(parentReference.c);//parent class C: 300
        // variables will be from Parent class
        //methods will be from child class

        //4. child class reference = parent class object ---> Invalid case --> CTE
            //Child childReference = new Parent();
    }
}
