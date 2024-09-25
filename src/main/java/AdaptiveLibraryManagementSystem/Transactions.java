package AdaptiveLibraryManagementSystem;

interface Transactions {
    void borrowBook();
    void returnBook();
    void listBooks();
    void search(String searchField, String searchString);
}

interface AdminTransactions {
    void addBook();
    void removeBook();
    void addMember();
    void removeMember();
    void listUsers();
    void listBooks();
    void search(String searchField, String searchString);
}

interface BookDBTransactions {
    void borrowBook(int bookId);
    void returnBook(int bookId);
    void addBook(String title, String author);
    void removeBook(int bookId);
    void listBooks();
    void search(String searchField, String searchString);
}

interface MemberDBTransactions {
    void addMember(String name);
    void removeMember(int memberId);
    void listUsers();
    void search(String searchField, String searchString);
}