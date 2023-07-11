package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Pune");
        address.setStreet("University road");
        address.setState("Maharashtra");
        address.setCountry("India");
        address.setPinCode(411005);

        Employee employee = new Employee();
        employee.setName("Sandesh");
        employee.setAddress(address);
        employee.setSalary(54000);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.itshaala.Employee.class);
        configuration.addAnnotatedClass(com.itshaala.Address.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        System.out.println("Employee with Address saved");
    }
}
