package AdaptiveLibraryManagementSystem;

interface Transactions {
    void borrowBook(int bookId);
    void returnBook(int bookId);
    void search(String searchField, String searchString);
}

interface AdminTransactions {
    void addBook(String Title, String Author);
    void removeBook(int bookId);
    void addMember(String memberName);
    void removeMember(int memberId);
    void search(String searchField, String searchString);
}

