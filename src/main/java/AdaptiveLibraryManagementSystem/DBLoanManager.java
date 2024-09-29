/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBLoanManager.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import java.sql.*;
import java.util.Arrays;

public class DBLoanManager implements DBLoanOperations{

    @Override
    public void borrowBook(int memberId, int bookId) {
        if (isBookAvailable(bookId)) {
            setBookAvailability(0, bookId);
            addLoan(bookId, memberId);
        } else {
            System.out.println("Book is not available!");
        }
    }

    @Override
    public void returnBook(int memberId, int bookId) {
        setBookAvailability(1, bookId);
        removeLoan(bookId, memberId);
    }

    @Override
    public void listLoans() {
        String sql = "SELECT * FROM loans";
        try (Connection conn = DBManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", memberID: " + rs.getInt("memberId") +
                        ", bookID: " + rs.getInt("bookId"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean isBookAvailable(int bookId) {
        String sql = "SELECT isAvailable FROM books WHERE id = " + bookId;
        try {
            Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            System.out.println("isAvailable: " + (rs.getInt("isAvailable") == 1 ? "Yes" : "No"));
            boolean isAvailable = rs.getInt("isAvailable") == 1;
            conn.close();
            return isAvailable;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void setBookAvailability(int availability, int bookId) {
        String sql = "UPDATE books SET isAvailable = ? WHERE id = ?";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, availability);
            stmt.setInt(2, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        for (Integer s : Arrays.asList(availability, bookId)) {
            sql = sql.replaceFirst("\\?", String.valueOf(s));
        }
        DBHistoryLogger.logTransaction(sql);
    }


    public void addLoan(int bookId, int memberId) {
        String sql = "INSERT INTO loans (memberId, bookId) VALUES (?, ?)";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, memberId);
            stmt.setInt(2, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        for (Integer s : Arrays.asList(memberId, bookId)) {
            sql = sql.replaceFirst("\\?", String.valueOf(s));
        }
        DBHistoryLogger.logTransaction(sql);
    }

    public void removeLoan(int bookId, int memberId) {
        String sql = "DELETE FROM loans WHERE (memberId, bookId) = (?, ?)";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, memberId);
            stmt.setInt(2, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        for (Integer s : Arrays.asList(memberId, bookId)) {
            sql = sql.replaceFirst("\\?", String.valueOf(s));
        }
        DBHistoryLogger.logTransaction(sql);
    }
}
