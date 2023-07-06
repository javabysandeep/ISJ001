package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User user1 = User.builder()
                .name("nikhil changed")
                .username("nikhil")
                .password("nikhil12345")
                .email("nikhil@gmail.com")
                .phone("989898989")
                .build();
        User user2 = User.builder()
                .name("nikhil changed")
                .username("nikhil")
                .password("nikhil12345")
                .email("nikhil@gmail.com")
                .phone("989898989")
                .build();
        User user3 = User.builder()
                .name("nikhil changed")
                .username("nikhil")
                .password("nikhil12345")
                .email("nikhil@gmail.com")
                .phone("989898989")
                .build();
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);



        //addUser(user);
        //System.out.println(getUser(1));
        //deleteUser(1);
       // addOrUpdateUser(user);
        bulkAddUser(userList);

    }

    private static User getUser(int userId) {
        Session session = getSession();
        User user = session.get(User.class, userId);
        session.close();
        return user;
    }

    private static void deleteUser(int userId) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, userId);
        session.remove(user);
        transaction.commit();
        session.close();
    }

    private static void addOrUpdateUser(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
        System.out.println("User is saved");
    }

    private static void bulkAddUser(List<User> userList) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(userList);
        transaction.commit();
        session.close();
        System.out.println("User is saved");
    }

    private static void updateUser(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
        System.out.println("User is saved");
    }

    private static Session getSession() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}
