import java.util.*;
import java.io.*;

interface Grading {
    void calculateGrade(double marks);
    void displayDetails();
}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

enum Grade {
    A_PLUS("A+", 90),
    A("A", 80),
    B_PLUS("B+", 70),
    B("B", 60),
    C("C", 50),
    FAIL("Fail", 0);

    private final String label;
    private final int minMarks;

    Grade(String label, int minMarks) {
        this.label = label;
        this.minMarks = minMarks;
    }

    public String getLabel() {
        return label;
    }

    public static Grade getGrade(double marks) {
        for (Grade grade : Grade.values()) {
            if (marks >= grade.minMarks) {
                return grade;
            }
        }
        return FAIL;
    }
}

class Student implements Grading {
    private String name;
    private int id;
    private double marks;
    private Grade grade;

    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = Grade.getGrade(marks);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public void calculateGrade(double marks) {
        this.grade = Grade.getGrade(marks);
        System.out.println("Grade: " + grade.getLabel());
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade.getLabel());
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Marks: %.2f, Grade: %s", id, name, marks, grade.getLabel());
    }
}

public class Student_Grading {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Load existing students from file if available
        loadStudentsFromFile(students);

        while (true) {
            System.out.println("\n--- Student Grading System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Calculate Class Average");
            System.out.println("4. Find Top Student");
            System.out.println("5. Save and Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(sc, students);
                    break;
                case 2:
                    displayAllStudents(students);
                    break;
                case 3:
                    calculateClassAverage(students);
                    break;
                case 4:
                    findTopStudent(students);
                    break;
                case 5:
                    saveStudentsToFile(students);
                    System.out.println("Data saved. Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addStudent(Scanner sc, List<Student> students) {
        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter marks: ");
            String marksStr = sc.nextLine();

            double marks = Double.parseDouble(marksStr);

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100.");
            }

            // Check for duplicate ID
            for (Student s : students) {
                if (s.getId() == id) {
                    System.out.println("Error: Student ID already exists.");
                    return;
                }
            }

            Student student = new Student(name, id, marks);
            students.add(student);
            System.out.println("Student added successfully!");

        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric marks.");
        }
    }

    private static void displayAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : students) {
            s.displayDetails();
            System.out.println("--------------------");
        }
    }

    private static void calculateClassAverage(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average.");
            return;
        }
        double total = students.stream().mapToDouble(Student::getMarks).sum();
        double average = total / students.size();
        System.out.printf("Class Average Marks: %.2f\n", average);
    }

    private static void findTopStudent(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Student topStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getMarks))
                .orElse(null);
        System.out.println("Top Student:");
        topStudent.displayDetails();
    }

    private static void loadStudentsFromFile(List<Student> students) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int id = Integer.parseInt(parts[1]);
                    double marks = Double.parseDouble(parts[2]);
                    students.add(new Student(name, id, marks));
                }
            }
            System.out.println("Students loaded from file.");
        } catch (IOException e) {
            System.out.println("No existing file found. Starting fresh.");
        }
    }

    private static void saveStudentsToFile(List<Student> students) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                pw.println(s.getName() + "," + s.getId() + "," + s.getMarks());
            }
        } catch (IOException e) {
            System.out.println();
            System.out.println("Error saving to file.");
        }
    }
}

