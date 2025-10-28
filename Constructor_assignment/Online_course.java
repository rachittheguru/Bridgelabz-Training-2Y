class Course {
    String courseName;
    int duration; // in months
    double fee;
    static String instituteName = "Tech Institute"; // shared

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 8000);
        Course c2 = new Course("Web Development", 4, 10000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Code Academy");
        c1.displayCourseDetails();
    }
}
