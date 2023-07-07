package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SaveEmployeeObject {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .employeeName("Sachin")
                .employeeSalary(190000)
                .skills(List.of("Core Java", "Advance Java", "Hibernate", "Spring", "SQL"))
                .build();

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.itshaala.Employee.class);//class & table mapping
        configuration.configure();// hibernate configuration: hibernate.cfg.xml

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();

        System.out.println("Employee object saved");

    }
}
