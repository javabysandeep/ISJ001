package oops.encapsulation;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        //person.age = -200;
        person.setAge(-200);
        System.out.println(person.getAge());
    }
}
