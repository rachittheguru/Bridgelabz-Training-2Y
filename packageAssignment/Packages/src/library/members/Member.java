package library.members;

public class Member {
    private String memberId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private int booksIssued;
    private static int totalMembers = 0;
    
    public Member(String memberId, String name, String email, String phoneNumber, String address) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.booksIssued = 0;
        totalMembers++;
    }
    
    public void displayMemberDetails() {
        System.out.println("=== Member Details ===");
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Books Issued: " + booksIssued);
        System.out.println();
    }
    
    public static Member registerNewMember(String memberId, String name, String email, String phoneNumber, String address) {
        System.out.println("Registering new member...");
        Member newMember = new Member(memberId, name, email, phoneNumber, address);
        System.out.println("Member '" + name + "' has been registered successfully!");
        System.out.println("Total members in library: " + totalMembers);
        return newMember;
    }
    
    public void issueBook() {
        if (booksIssued < 5) {
            booksIssued++;
            System.out.println("Book issued to " + name + ". Total books issued: " + booksIssued);
        } else {
            System.out.println("Cannot issue more books. " + name + " has already issued maximum number of books (5).");
        }
    }
    
    public void returnBook() {
        if (booksIssued > 0) {
            booksIssued--;
            System.out.println("Book returned by " + name + ". Remaining books: " + booksIssued);
        } else {
            System.out.println(name + " has no books to return.");
        }
    }
    
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public int getBooksIssued() { return booksIssued; }
    public static int getTotalMembers() { return totalMembers; }
}
