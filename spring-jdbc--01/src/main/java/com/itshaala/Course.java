package com.itshaala;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private int id;
    private String courseName;
    private int price;
}
