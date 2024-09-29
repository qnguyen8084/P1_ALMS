/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * Operations.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

interface AdapterOperations{
    void search(String table, String searchField, String searchString);
    void listHistory();
}

interface BookAdapterOperations {
    void addBook(Book book);
    void removeBook(int bookId);
    void listBooks();
}

interface UserAdapterOperations {
    void addMember(Member member);
    void removeMember(int memberId);
    void listMembers();
}

interface LoanAdapterOperations {
    void borrowBook(int memberId, int bookId);
    void returnBook(int memberId, int bookId);
    void listLoans();
}

interface ConsoleOperations {
    void search();
    void listHistory();
}

interface ConsoleBookOperations {
    void addBook();
    void removeBook();
    void listBooks();
}

interface ConsoleUserOperations {
    void addMember();
    void removeMember();
    void listMembers();
}

interface ConsoleLoanOperations {
    void borrowBook();
    void returnBook();
    void listLoans();
}

interface DBOperations {
    void search(String table, String searchField, String searchString);
}

interface DBBookOperations {
    void addBook(String author, String title);
    void removeBook(int bookId);
    void listBooks();
}

interface DBUserOperations {
    void addMember(String name);
    void removeMember(int memberId);
    void listMembers();
}

interface DBLoanOperations {
     void borrowBook(int memberId, int bookId);
     void returnBook(int memberId, int bookId);
     void listLoans();
}