package oops.sms;

import oops.sms.controller.StudentController;
import oops.sms.model.Student;

public class Frontend {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.add(new Student());
    }
}
