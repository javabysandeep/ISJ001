package com.itshaala;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("sandesh");

        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.setName("Nikhil");
        permanentEmployee.setSalary(10000);

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Lalit");
        contractEmployee.setRatePerHour(2000);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.itshaala.Employee.class);
        configuration.addAnnotatedClass(com.itshaala.PermanentEmployee.class);
        configuration.addAnnotatedClass(com.itshaala.ContractEmployee.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        session.save(permanentEmployee);
        session.save(contractEmployee);

        transaction.commit();
        session.close();
        System.out.println("Employees saved");
    }
}
