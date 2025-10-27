import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Modular Programming Demo ===\n");
        
        Student student1 = new Student("Alice Johnson", 1001, "Computer Science");
        Student student2 = new Student("Bob Smith", 1002, "Mathematics");
        Student student3 = new Student("Carol Davis", 1003, "Physics");
        
        System.out.println("Student Information:");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
        
        System.out.println("=== Using Getter Methods ===");
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Roll Number: " + student1.getRollNumber());
        System.out.println("Student 1 Department: " + student1.getDepartment());
        
        System.out.println("\n=== Using Setter Methods ===");
        System.out.println("Before update:");
        student1.displayStudentDetails();
        
        student1.setName("Alice Johnson-Wilson");
        student1.setDepartment("Computer Science & Engineering");
        
        System.out.println("After update:");
        student1.displayStudentDetails();
    }
}
