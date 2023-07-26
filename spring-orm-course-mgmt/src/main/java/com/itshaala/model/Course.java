package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "price")
    private int coursePrice;
}
