package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class Demo11ListEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11, "Sandesh", 67000);
        Employee employee2 = new Employee(10, "Aditi", 47000);
        Employee employee3 = new Employee(1, "Navnath", 54000);
        Employee employee4 = new Employee(14, "Vikas", 7000);
        Employee employee5 = new Employee(5, "Priya", 87000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        //way 1. All elements in one line
//        System.out.println(employeeList);

        //way 2. Traditional for loop
        /*for (int index = 0; index < employeeList.size(); index++) {
            System.out.println(employeeList.get(index));
        }*/

        //way 3 : enhanced forloop
      /*  for (Employee employee : employeeList) {
            System.out.println(employee);
        }*/

        // way 4: forEach with Lambda
//        employeeList.forEach(employee -> System.out.println(employee));

        //way 5: foreach with method reference
        employeeList.forEach(System.out::println);
    }
}
