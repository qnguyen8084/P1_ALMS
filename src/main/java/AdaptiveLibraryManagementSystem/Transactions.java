/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * Transactions.java
 * Mon, Sep 30 2024
 */

package AdaptiveLibraryManagementSystem;

public interface Transactions {
    public void create();
    public void remove(int id);
    public void update(String field, String term);
    public void delete();
}
