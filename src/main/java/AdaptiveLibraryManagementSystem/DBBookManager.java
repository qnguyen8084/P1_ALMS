/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBBookManager.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import java.sql.*;
import java.util.Arrays;

public class DBBookManager implements DBBookOperations {

    @Override
    public void addBook(String title, String author) {
        String sql = "INSERT INTO books (title, author) VALUES (?, ?)";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        for (String s : Arrays.asList(title, author)) {
            sql = sql.replaceFirst("\\?", s);
        }
        DBHistoryLogger.logTransaction(sql);
    }

    @Override
    public void removeBook(int bookId) {
        String sql = "DELETE FROM BOOKS WHERE ID = (?)";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        DBHistoryLogger.logTransaction(sql.replaceFirst("\\?", String.valueOf(bookId)));
    }

    @Override
    public void listBooks() {
        String sql = "SELECT * FROM books";
        try (Connection conn = DBManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Title: " + rs.getString("title") +
                        ", Author: " + rs.getString("author") +
                        ", Available: " + (rs.getInt("isAvailable") == 1 ? "Yes" : "No"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
