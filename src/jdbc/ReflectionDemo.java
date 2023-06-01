package jdbc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        Class employeeClass = Class.forName("jdbc.Employee");
        String classLoaderName = employeeClass.getClassLoader().toString();
        System.out.println(classLoaderName);

        Field[] fields = employeeClass.getFields();
        for (Field filed : fields) {
            System.out.println(filed.getName());
        }
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method return type : "+method.getReturnType().getName());
            System.out.println(method.getName());
        }
        System.out.println("Constroctors of employee");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter:parameters
                 ) {
                System.out.print(parameter.getName()+" ");
            }
        }
    }
}
