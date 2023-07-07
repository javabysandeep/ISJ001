package com.itshaala;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private int personId;

    @Column(name = "person_name")
    private String personName;

    @ManyToOne(targetEntity = com.itshaala.Address.class)
    @JoinColumn(name = "addressId")
    private Address address;


}
