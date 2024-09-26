package AdaptiveLibraryManagementSystem;

interface _Transactions {
    void addBook(Book book);
    void removeBook(int bookId);
    void listBooks();
    void addMember(Member member);
    void removeMember(int memberId);
    void listMembers();
    void borrowBook(int memberId, int bookId);
    void returnBook(int memberId, int bookId);
    void listLoans();
    void search(String searchField, String searchString);
}

interface Transactions {
    void addBook();
    void removeBook();
    void listBooks();
    void addMember();
    void removeMember();
    void listMembers();
    void borrowBook();
    void returnBook();
    void listLoans();
    void search(String searchField, String searchString);
}

interface DBTransactions {
    void addMember(String name);
    void removeMember(int memberId);
    void listMembers();
    void addBook(String author, String title);
    void removeBook(int bookId);
    void listBooks();
    void borrowBook(int memberId, int bookId);
    void returnBook(int memberId, int bookId);
    void listLoans();
    void search(String searchField, String searchString);
}