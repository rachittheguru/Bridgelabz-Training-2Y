package library.transactions;

public class Transaction {
    private String transactionId;
    private String bookId;
    private String memberId;
    private String transactionType;
    private String transactionDate;
    private String dueDate;
    private static int transactionCounter = 1000;
    
    public Transaction(String bookId, String memberId, String transactionType, String transactionDate, String dueDate) {
        this.transactionId = "TXN" + (++transactionCounter);
        this.bookId = bookId;
        this.memberId = memberId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.dueDate = dueDate;
    }
    
    public Transaction(String bookId, String memberId, String transactionType, String transactionDate) {
        this.transactionId = "TXN" + (++transactionCounter);
        this.bookId = bookId;
        this.memberId = memberId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.dueDate = "N/A";
    }
    
    public void displayTransactionDetails() {
        System.out.println("=== Transaction Details ===");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Book ID: " + bookId);
        System.out.println("Member ID: " + memberId);
        System.out.println("Type: " + transactionType);
        System.out.println("Date: " + transactionDate);
        if (transactionType.equals("ISSUE")) {
            System.out.println("Due Date: " + dueDate);
        }
        System.out.println();
    }
    
    public static Transaction createIssueTransaction(String bookId, String memberId, String transactionDate, String dueDate) {
        System.out.println("Creating issue transaction...");
        Transaction transaction = new Transaction(bookId, memberId, "ISSUE", transactionDate, dueDate);
        System.out.println("Issue transaction created successfully!");
        return transaction;
    }
    
    public static Transaction createReturnTransaction(String bookId, String memberId, String transactionDate) {
        System.out.println("Creating return transaction...");
        Transaction transaction = new Transaction(bookId, memberId, "RETURN", transactionDate);
        System.out.println("Return transaction created successfully!");
        return transaction;
    }
    
    public boolean isOverdue(String currentDate) {
        if (transactionType.equals("ISSUE") && dueDate != null) {
            return currentDate.compareTo(dueDate) > 0;
        }
        return false;
    }
    
    public String getTransactionId() { return transactionId; }
    public String getBookId() { return bookId; }
    public String getMemberId() { return memberId; }
    public String getTransactionType() { return transactionType; }
    public String getTransactionDate() { return transactionDate; }
    public String getDueDate() { return dueDate; }
}
