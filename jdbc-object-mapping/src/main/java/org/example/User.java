package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private int userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
}
