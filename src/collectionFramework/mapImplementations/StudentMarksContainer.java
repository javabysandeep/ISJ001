package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMarksContainer {
    public static void main(String[] args) {
        Map<Student, Map<String, Integer>> studentSubjectMarks = new HashMap<>();

        Student student1 = new Student(1,"Sandesh");

        Map<String, Integer> student1Marks = new HashMap<>();
        student1Marks.put("Physics",98);
        student1Marks.put("Chemistry",88);
        student1Marks.put("Maths",91);

        studentSubjectMarks.put(student1,student1Marks);


        Student student2 = new Student(101,"Aditi");
        Map<String, Integer> student2Marks = new HashMap<>();
        student2Marks.put("Physics",78);
        student2Marks.put("Chemistry",66);
        student2Marks.put("Maths",55);

        studentSubjectMarks.put(student2,student2Marks);

        Student student3 = new Student(11,"Navnath");
        Map<String, Integer> student3Marks = new HashMap<>();
        student3Marks.put("Physics",56);
        student3Marks.put("Chemistry",46);
        student3Marks.put("Maths",58);

        studentSubjectMarks.put(student3,student3Marks);

        Set<Map.Entry<Student, Map<String, Integer>>> entries = studentSubjectMarks.entrySet();
        entries.forEach(System.out::println);


    }
}
