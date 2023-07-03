package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Work\\ISJ001\\hibernate-001\\src\\main\\resources\\hibernate.config.properties");
        properties.load(fileInputStream);

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(com.itshaala.Employee.class);

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = Employee.builder()
                .employeeId(1)
                .employeeName("Sandeep")
                .employeeSalary(10000)
                .build();
        session.saveOrUpdate(employee);
        transaction.commit();
        session.close();
    }
}
