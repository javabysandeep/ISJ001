package com.itshaala;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int baseId;
    private String baseName;
}
