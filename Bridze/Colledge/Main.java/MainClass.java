import COLLEDGE.student.java.Student;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rachit Sharma", 101);
        Faculty f1 = new Faculty("Dr. Mehta", "Computer Science");

        System.out.println("=== Student Details ===");
        s1.displayStudentDetails();

        System.out.println("\n=== Faculty Details ===");
        f1.displayFacultyDetails();
    }
}
