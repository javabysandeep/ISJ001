package com.itshaala;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue(value = "perm")
public class PermanentEmployee extends Employee {
    private int salary;

}
