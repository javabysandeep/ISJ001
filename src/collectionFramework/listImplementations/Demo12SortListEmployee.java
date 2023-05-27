package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class Demo12SortListEmployee {
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

        //sort employees
        //Collections.sort(employeeList);//List of Comparable
        employeeList.forEach(System.out::println);

    }
}
