package com.itshaala.beans;

import lombok.*;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
}
