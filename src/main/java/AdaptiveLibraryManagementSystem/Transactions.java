package AdaptiveLibraryManagementSystem;

public interface Transactions<T> {
    void add(T obj);
    void remove(int id);
    void search(String searchTerm);
    void list();
}
