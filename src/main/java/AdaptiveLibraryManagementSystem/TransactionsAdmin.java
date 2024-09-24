package AdaptiveLibraryManagementSystem;

public interface TransactionsAdmin {
    void addBook(String Title, String Author);
    void removeBook(int bookId);
    void addMember(String memberName);
    void removeMember(int memberId);
    void search(String searchField, String searchString);
}
