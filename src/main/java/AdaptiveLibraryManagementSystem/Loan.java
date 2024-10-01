/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * Loan.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import org.sqlite.core.DB;

public class Loan {
    private int id;
    private final int bookId;

    public Loan(int id, int bookId, int memberId) {

        this.bookId = bookId;
        this.memberId = memberId;
    }

    public Loan(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

}