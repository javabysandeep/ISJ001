package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean(name = "employee")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Sandesh");
        employee.setEmployeeSalary(198000);
        return employee;
    }

    @Bean(name = "product")
    public Product getProduct() {
        Product product = new Product(1, "Mobile", 67000);
        return product;
    }
}
