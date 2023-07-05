package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       // addUser();
        UserDao userDao = new UserDao();
        System.out.println(userDao.getUser(1));

    }

    private static void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scanner.nextLine();

        System.out.println("Enter the password");
        String password = scanner.nextLine();

        System.out.println("Enter the name");
        String name = scanner.nextLine();

        System.out.println("Enter the email");
        String email = scanner.nextLine();

        System.out.println("Enter the phone");
        String phone = scanner.nextLine();

        User user = User.builder()
                .username(username)
                .password(password)
                .name(name)
                .email(email)
                .phone(phone)
                .build();

        UserDao userDao = new UserDao();
        userDao.addUser(user);
    }
}
