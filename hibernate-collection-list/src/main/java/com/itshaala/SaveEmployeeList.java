package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Set;

public class SaveEmployeeList {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sandesh");
        employee.setAddress(Set.of("Pune", "Mumbai","Washim","Dubai"));
        employee.setPhoneNumbers(Set.of(98989,123456,7777,5678));

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.itshaala.Employee.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        System.out.println("Employee Object saved");

    }
}
