package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SavePersonObject {
    public static void main(String[] args) {
        Address address = Address.builder()
                .street("bhamurda")
                .city("mungala")
                .State("MH")
                .Country("India")
                .build();
        Person person = Person.builder()
                .personName("Nikhil")
                .address(address)
                .build();

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.itshaala.Address.class);//class & table mapping
        configuration.addAnnotatedClass(com.itshaala.Person.class);//class & table mapping

        configuration.configure();// hibernate configuration: hibernate.cfg.xml

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
        session.save(person);
        transaction.commit();
        session.close();

        System.out.println("Person object saved");

    }
}
