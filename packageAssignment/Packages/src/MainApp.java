import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== University Course Management System ===\n");
        
        Course course1 = new Course("CS101", "Introduction to Programming", 3, "Dr. Smith", "Fall 2024");
        Course course2 = new Course("CS201", "Data Structures", 4, "Prof. Johnson", "Spring 2024");
        Course course3 = new Course("CS301", "Algorithms", 4, "Dr. Brown", "Fall 2024");
        
        System.out.println("Available Courses:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
        
        System.out.println("=== Individual Course Information ===");
        System.out.println("Course 1 Details:");
        course1.displayCourseCode();
        course1.displayCourseName();
        course1.displayCredits();
        
        System.out.println("\nCourse 2 Details:");
        course2.displayInstructor();
        course2.displaySemester();
    }
}
