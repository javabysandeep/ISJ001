package oops.objectClassDemos;

import java.lang.reflect.Method;

public class MethodGetClass {
    public static void main(String[] args) {
        MethodGetClass ref = new MethodGetClass();
        System.out.println(ref.getClass());//it prints the complete class name with package name
        Class<? extends MethodGetClass> aClass = ref.getClass();
        System.out.println(ref.getClass());
        System.out.println("Get class name "+ref.getClass().getName());
        System.out.println("Class loader "+aClass.getClassLoader().toString());
        Method[] methods = aClass.getMethods();
        for (Method method:methods) {
            System.out.println(method.toString());
        }
    }
}
