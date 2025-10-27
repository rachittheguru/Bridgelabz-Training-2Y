import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");
        
        System.out.println("1. ADDING A NEW BOOK");
        System.out.println("====================");
        Book book1 = Book.addNewBook("BK001", "Java Programming", "John Smith", "978-1234567890", "Programming");
        Book book2 = Book.addNewBook("BK002", "Data Structures", "Jane Doe", "978-0987654321", "Computer Science");
        Book book3 = Book.addNewBook("BK003", "Algorithms", "Bob Johnson", "978-1122334455", "Computer Science");
        
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
        
        System.out.println("2. REGISTERING NEW MEMBERS");
        System.out.println("==========================");
        Member member1 = Member.registerNewMember("M001", "Alice Brown", "alice@email.com", "123-456-7890", "123 Main St");
        Member member2 = Member.registerNewMember("M002", "Charlie Wilson", "charlie@email.com", "987-654-3210", "456 Oak Ave");
        
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        
        System.out.println("3. ISSUING BOOKS TO MEMBERS");
        System.out.println("===========================");
        
        System.out.println("Issuing book '" + book1.getTitle() + "' to " + member1.getName());
        book1.issueBook();
        member1.issueBook();
        Transaction issue1 = Transaction.createIssueTransaction(book1.getBookId(), member1.getMemberId(), "2024-01-15", "2024-02-15");
        issue1.displayTransactionDetails();
        
        System.out.println("Issuing book '" + book2.getTitle() + "' to " + member2.getName());
        book2.issueBook();
        member2.issueBook();
        Transaction issue2 = Transaction.createIssueTransaction(book2.getBookId(), member2.getMemberId(), "2024-01-16", "2024-02-16");
        issue2.displayTransactionDetails();
        
        System.out.println("Issuing book '" + book3.getTitle() + "' to " + member1.getName());
        book3.issueBook();
        member1.issueBook();
        Transaction issue3 = Transaction.createIssueTransaction(book3.getBookId(), member1.getMemberId(), "2024-01-17", "2024-02-17");
        issue3.displayTransactionDetails();
        
        System.out.println("Updated Member Status:");
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        
        System.out.println("4. RETURNING BOOKS");
        System.out.println("==================");
        
        System.out.println("Returning book '" + book1.getTitle() + "' by " + member1.getName());
        book1.returnBook();
        member1.returnBook();
        Transaction return1 = Transaction.createReturnTransaction(book1.getBookId(), member1.getMemberId(), "2024-01-25");
        return1.displayTransactionDetails();
        
        System.out.println("5. FINAL LIBRARY STATUS");
        System.out.println("=======================");
        System.out.println("Books in Library:");
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
        
        System.out.println("Members Status:");
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        
        System.out.println("Total Members in Library: " + Member.getTotalMembers());
    }
}
