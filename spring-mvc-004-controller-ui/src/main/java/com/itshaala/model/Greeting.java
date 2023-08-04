package com.itshaala.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Greeting {
    private String morningGreeting;
    private String afternoonGreeting;
    private String eveningGreeting;
    private String nightGreeting;
}
