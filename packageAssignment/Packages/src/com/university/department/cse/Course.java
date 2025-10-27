package com.university.department.cse;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    private String semester;
    
    public Course(String courseCode, String courseName, int credits, String instructor, String semester) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
    }
    
    public void displayCourseDetails() {
        System.out.println("=== Course Details ===");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + instructor);
        System.out.println("Semester: " + semester);
        System.out.println();
    }
    
    public void displayCourseCode() {
        System.out.println("Course Code: " + courseCode);
    }
    
    public void displayCourseName() {
        System.out.println("Course Name: " + courseName);
    }
    
    public void displayCredits() {
        System.out.println("Credits: " + credits);
    }
    
    public void displayInstructor() {
        System.out.println("Instructor: " + instructor);
    }
    
    public void displaySemester() {
        System.out.println("Semester: " + semester);
    }
    
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
    public String getInstructor() { return instructor; }
    public String getSemester() { return semester; }
}
