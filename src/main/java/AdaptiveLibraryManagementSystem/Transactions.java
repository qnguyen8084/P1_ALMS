package AdaptiveLibraryManagementSystem;

interface Transactions {
    void borrowBook();
    void returnBook();
    void search(String searchField, String searchString);
}

interface AdminTransactions {
    void addBook();
    void removeBook();
    void addMember();
    void removeMember();
    void search(String searchField, String searchString);
}

interface DBTransactions {
  void borrowBook(int bookId);
  void returnBook(int bookId);
  void search(String searchField, String searchString);
}

interface AdminDBTransactions {
    void addMember(String name);
    void removeMember(int memberId);
    void addBook(String title, String author);
    void removeBook(int bookId);
    void search(String searchField, String searchString);
}