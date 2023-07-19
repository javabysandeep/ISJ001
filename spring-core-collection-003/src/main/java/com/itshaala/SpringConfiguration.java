package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class SpringConfiguration {

    @Bean(name = "employee")
    @Scope(scopeName = "prototype")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Priya");
        employee.setEmployeeSalary(190000);
        employee.setAddress(List.of("Pune", "Mumbai", "Patna"));
        return employee;
    }
}
