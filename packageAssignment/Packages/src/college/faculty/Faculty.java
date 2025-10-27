package college.faculty;

public class Faculty {
    private String name; 
    private String subject;
    
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public void displayFacultyName() {
        System.out.println("Faculty Name: " + name);
    }
    
    public void displaySubject() {
        System.out.println("Subject: " + subject);
    }
    
    public void displayFacultyDetails() {
        System.out.println("=== Faculty Details ===");
        displayFacultyName();
        displaySubject();
        System.out.println();
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
}
