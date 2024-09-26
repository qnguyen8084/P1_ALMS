package AdaptiveLibraryManagementSystem;

interface AdminTransactions {
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
    void borrowBook(int bookId);
    void returnBook(int bookId);
    void listLoans();
    void search(String searchField, String searchString);
}

/*
interface ADBTransactions {
    void addMember(Member member);
    void removeMember(Member member);
    void listMembers();
    void addBook(Book book);
    void removeBook(Book book);
    void listBooks();
    void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
    void listLoans();
    void search(String searchField, String searchString);
}*/