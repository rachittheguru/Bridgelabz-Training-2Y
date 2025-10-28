public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    String thesisTitle;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Thesis: " + thesisTitle);
    }

    public static void main(String[] args) {
        PostgraduateStudent s1 = new PostgraduateStudent(101, "Rachit", 8.7, "AI in Education");
        s1.displayDetails();
        s1.setCGPA(9.1);
        System.out.println("Updated CGPA: " + s1.getCGPA());
    }
}
