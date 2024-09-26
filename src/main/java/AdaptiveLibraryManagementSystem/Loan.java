package AdaptiveLibraryManagementSystem;

public class Loan {
    private final int id;
    private final int bookId;
    private final int memberId;

    public Loan(int id, int bookId, int memberId) {
        this.id = id;
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public Loan(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

}
