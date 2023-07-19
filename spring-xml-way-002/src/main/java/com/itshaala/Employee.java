package com.itshaala;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
}