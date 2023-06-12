package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int id;
    private String name;
    private int phone;
    private String email;
    private String address;
    private String gender;
    private Date dateOfBirth;
    private String studentClass;
    private String batch;

}
