package com.itshaala;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDateFromPropertiesFile {
    public static void main(String[] args) throws IOException {
        //build the object from user Details
        User user = User.builder()
                .username("Admin")
                .password("Admin")
                .name("Sachin")
                .email("abc@gmail.com")
                .phone("989898989")
                .build();


        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Work\\ISJ003\\hibernate-first-app\\src\\main\\resources\\hibernate.cfg.properties");
        properties.load(fileInputStream);

        System.out.println("url " + properties.get("hibernate.connection.url"));
        System.out.println("username " + properties.get("hibernate.connection.username"));
        System.out.println("password " + properties.get("hibernate.connection.password"));
        System.out.println("Driver class " + properties.get("hibernate.connection.driver_class"));


    }
}
