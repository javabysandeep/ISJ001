package com.itshaala.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
    private String courseDescription;
}
