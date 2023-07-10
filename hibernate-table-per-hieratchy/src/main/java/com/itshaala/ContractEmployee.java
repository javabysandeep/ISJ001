package com.itshaala;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue(value = "contract")
public class ContractEmployee extends Employee {
    private int ratePerHour;

}
