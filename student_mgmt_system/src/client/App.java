package client;

import controller.StudentController;
import model.Student;

import java.sql.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = scanner.next();

        System.out.println("Enter the student phone");
        int phone = scanner.nextInt();

        System.out.println("Enter student email");
        String email = scanner.next();

        System.out.println("Enter student address");
        String address = scanner.next();

        System.out.println("Enter student gender");
        String gender = scanner.next();

        System.out.println("Enter student class");
        String studentClass = scanner.next();

        System.out.println("Enter student batch");
        String batch = scanner.next();

        Student student = new Student();
        student.setName(name);
        student.setPhone(phone);
        student.setEmail(email);
        student.setAddress(address);
        student.setGender(gender);
        student.setStudentClass(studentClass);
        student.setBatch(batch);

        studentController.addStudent(student);
    }
}
