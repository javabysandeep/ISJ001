package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ReadEmployeeObject {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);//class & table mapping
        configuration.configure();// hibernate configuration: hibernate.cfg.xml
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class, 1);
        session.close();
        System.out.println(employee);
    }
}
