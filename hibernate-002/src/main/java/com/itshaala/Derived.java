package com.itshaala;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Derived extends Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int derivedId;
    private String derivedName;
}
