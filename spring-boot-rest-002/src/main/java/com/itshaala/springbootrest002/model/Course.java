package com.itshaala.springbootrest002.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "id")
    private Integer courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "price")
    private Integer coursePrice;
}
