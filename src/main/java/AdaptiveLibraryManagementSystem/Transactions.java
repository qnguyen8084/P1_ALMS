package AdaptiveLibraryManagementSystem;

interface BookDBTransactions {
    void borrowBook(int bookId);
    void returnBook(int bookId);
    void addBook(String title, String author);
    void removeBook(int bookId);
    void listBooks();
}

interface MemberDBTransactions {
    void addMember(String name);
    void removeMember(int memberId);
    void listMembers();
}

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
    void addMember(Member member);
    void removeMember(Member member);
    void listMembers();
    void addBook(Book book);
    void removeBook(Book book);
    void loanBook(Member member, Book book);
    void returnBook(Member member, Book book);
    void listBooks();
    void search(String searchField, String searchString);
}