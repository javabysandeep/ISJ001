package com.itshaala.beans;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}
