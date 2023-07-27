package com.itshaala.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "course1")
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
