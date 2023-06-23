package service;

import dao.CourseDao;
import model.Course;

import java.util.List;

public class CourseService {
    CourseDao courseDao = new CourseDao();
    public void addCourse(Course course){
        courseDao.addCourse(course);
    }

    public List<Course> getAllCourses() {
        return  courseDao.getAllCourses();
    }
}
