package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo24ReadJsonFile {
    public static void main(String[] args) throws IOException {
        File file = new File("students.json");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();

        Student student = new Student();
        /*student.setStudentId();
        student.setStudentName();
        student.setStudentAddress();*/

        while (data != -1) {
            System.out.print((char) data);
            data = fileInputStream.read();
        }

    }
}
