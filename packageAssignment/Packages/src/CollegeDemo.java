import college.student.Student;
import college.faculty.Faculty;

public class CollegeDemo {
    public static void main(String[] args) {
        System.out.println("=== College Management System Demo ===\n");
        
        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Smith", 102);
        
        System.out.println("Student Information:");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        Faculty faculty1 = new Faculty("Dr. Alice Johnson", "Computer Science");
        Faculty faculty2 = new Faculty("Prof. Bob Wilson", "Mathematics");
        
        System.out.println("Faculty Information:");
        faculty1.displayFacultyDetails();
        faculty2.displayFacultyDetails();
        
        System.out.println("=== Individual Method Calls ===");
        System.out.println("Student 1 - Name only:");
        student1.displayStudentName();
        
        System.out.println("Student 1 - Roll Number only:");
        student1.displayRollNumber();
        
        System.out.println("Faculty 1 - Name only:");
        faculty1.displayFacultyName();
        
        System.out.println("Faculty 1 - Subject only:");
        faculty1.displaySubject();
    }
}
