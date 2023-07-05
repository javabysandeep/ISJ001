package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        // reading the data from properties file and putting this in the properties object.
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Work\\ISJ003\\hibernate-first-app\\src\\main\\resources\\hibernate.cfg.properties");
        properties.load(fileInputStream);

        //build the object from user Details
        User user = User.builder()
                .username("Admin")
                .password("Admin")
                .name("Sachin")
                .email("abc@gmail.com")
                .phone("989898989")
                .build();

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(com.itshaala.User.class);

        StandardServiceRegistryBuilder standardServiceRegistryBuilder =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }
}
