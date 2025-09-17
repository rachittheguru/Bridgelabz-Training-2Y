// problem no 1 
import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    String name;
    List<Book> books; 
    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.display();
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib2.addBook(b1);
        lib2.addBook(b2);
    }
}
// Problem no 2 
import java.util.*;

class Customer {
    String name;
    Bank bank;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    void setBank(Bank bank) {
        this.bank = bank;
    }

    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

class Bank {
    String name;
    List<Customer> customers;

    Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    void openAccount(Customer c, double initialDeposit) {
        c.setBank(this);
        c.balance = initialDeposit;
        customers.add(c);
        System.out.println(c.name + " opened account in " + name + " with " + initialDeposit);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI");
        Customer c1 = new Customer("Rachit");
        Customer c2 = new Customer("Aman");

        b1.openAccount(c1, 5000);
        b1.openAccount(c2, 10000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

// Problem no 3 
import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    List<Employee> employees;

    Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) e.display();
    }
}

class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.showEmployees();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Charlie"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
	}
}

// problem no 4 
import java.util.*;

class Patient {
    String name;
    ArrayList<Doctor> doctors; 

    Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void showDoctors() {
        System.out.println(name + " is consulting with:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.name + " (" + d.specialization + ")");
        }
    }
}

class Doctor {
    String name;
    String specialization;
    ArrayList<Patient> patients;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting patient " + p.name);
        patients.add(p);
        p.addDoctor(this); 
    }

    void showPatients() {
        System.out.println("Dr. " + name + " is treating:");
        for (Patient p : patients) {
            System.out.println("  " + p.name);
        }
    }
}

class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor d)
