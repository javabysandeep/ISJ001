package com.itshaala.springboot001;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
}
