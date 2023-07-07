package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveDerivedObject {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.setBaseName("Base");
        derived.setDerivedName("Derived");

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Derived.class);//class & table mapping

        configuration.configure();// hibernate configuration: hibernate.cfg.xml

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(derived);
        transaction.commit();
        session.close();

        System.out.println("Derived object saved");

    }
}
