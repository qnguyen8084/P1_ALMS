/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * Transactions.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

interface AdapterOperations {
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
    void listHistory();
}

interface AdminOperations {
    void addBook();
    void removeBook();
    void listBooks();
    void addMember();
    void removeMember();
    void listMembers();
    void borrowBook();
    void returnBook();
    void listLoans();
    void search();
    void listHistory();
}

interface DBOperations {
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