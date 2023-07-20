package com.itshaala.config;

import com.itshaala.beans.Address;
import com.itshaala.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

import java.util.Objects;

@Configuration
@PropertySource("spring.cfg.properties")
public class SpringConfiguration {

    //get the object created by spring container
    @Autowired
    Environment environment;

    @Bean(name = "employee")
    public Employee getEmployeeBean() {
        Employee employee = new Employee();
        employee.setEmployeeId(Integer.parseInt(Objects.requireNonNull(environment.getProperty("employeeId"))));
        employee.setEmployeeName(environment.getProperty("employeeName"));
        employee.setEmployeeSalary(Integer.parseInt(Objects.requireNonNull(environment.getProperty("employeeSalary"))));
        employee.setAddress(getEmployeeAddress());
        return employee;
    }

    private Address getEmployeeAddress() {
        return Address.builder()
                .street("Shivaji nagar")
                .city("Pune")
                .state("Maharashtra")
                .pinCode("411005")
                .build();
    }
}
