package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo16SortListEmployee {
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
//        Comparator :  int compare(T o1, T o2);
//        Collections.sort(employeeList, (emp1, emp2) -> emp1.getEmployeeSalary() - emp2.getEmployeeSalary());
//        Collections.sort(employeeList, Comparator.comparingInt(Employee::getEmployeeId));
//        Collections.sort(employeeList, (emp1, emp2)->emp1.getEmployeeName().compareTo(emp2.getEmployeeName()));
        Collections.sort(employeeList, Comparator.comparing(Employee::getEmployeeName));
        employeeList.forEach(System.out::println);

    }
}
