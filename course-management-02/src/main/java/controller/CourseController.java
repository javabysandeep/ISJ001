package controller;

import model.Course;
import service.CourseService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/course")
public class CourseController extends GenericServlet {
    CourseService courseService = new CourseService();

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // courseService.addCourse(acceptCourseDetails(servletRequest));
        // sendResponseToClient(servletResponse);
        List<Course> courseList = courseService.getAllCourses();

        PrintWriter writer = servletResponse.getWriter();

        writer.print("<table>");
        writer.print("<tr> <th> Course ID </th> <th> Course Name </th> <th> Course Price </th> </tr>");
        for (Course course : courseList) {
            writer.print("<tr>");
            writer.print("<td>");
            writer.println(course.getCourseId());
            writer.print("</td>");
            writer.print("<td>");
            writer.println(course.getCourseName());
            writer.print("</td>");
            writer.print("<td>");
            writer.println(course.getCoursePrice());
            writer.print("</td>");
            writer.print("</tr>");
        }
        writer.print("</table>");

    }

    private static void sendResponseToClient(ServletResponse servletResponse) throws IOException {
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Course submitted successfully.");
    }

    private static Course acceptCourseDetails(ServletRequest servletRequest) {
        int id = Integer.parseInt(servletRequest.getParameter("id"));
        String name = servletRequest.getParameter("name");
        int price = Integer.parseInt(servletRequest.getParameter("price"));
        Course course = new Course(id, name, price);
        return course;
    }
}
