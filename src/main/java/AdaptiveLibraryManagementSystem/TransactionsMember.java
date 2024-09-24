package AdaptiveLibraryManagementSystem;

public interface TransactionsMember {
    void borrowBook(int bookId);
    void returnBook(int bookId);
    void search(String searchField, String searchString);
}

