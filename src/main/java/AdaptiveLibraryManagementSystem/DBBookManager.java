/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * DBBookManager.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import java.sql.*;
import java.util.Arrays;

public class DBBookManager implements DBBookOperations {

    // Method to add a new book to the database
    @Override
    public void addBook(String title, String author) {
        // SQL query for inserting a book into the books table
        String sql = "INSERT INTO books (title, author) VALUES (?, ?)";
        try (Connection conn = DBManager.connect(); // Establish connection
             PreparedStatement stmt = conn.prepareStatement(sql)) { // Prepare the statement
            stmt.setString(1, title); // Set the title parameter
            stmt.setString(2, author); // Set the author parameter
            stmt.executeUpdate(); // Execute the update to add the book
        } catch (SQLException e) {
            System.out.println(e.getMessage()); // Handle any SQL exceptions
        }

        // Replace placeholders in the SQL query with actual values for logging
        for (String s : Arrays.asList(title, author)) {
            sql = sql.replaceFirst("\\?", s);
        }
        DBHistoryLogger.logTransaction(sql); // Log the transaction with the updated SQL query
    }

    // Method to remove a book from the database by its ID
    @Override
    public void removeBook(int bookId) {
        // SQL query for deleting a book from the books table by its ID
        String sql = "DELETE FROM BOOKS WHERE ID = (?)";
        try (Connection conn = DBManager.connect(); // Establish connection
             PreparedStatement stmt = conn.prepareStatement(sql)) { // Prepare the statement
            stmt.setInt(1, bookId); // Set the book ID parameter
            stmt.executeUpdate(); // Execute the update to remove the book
        } catch (SQLException e) {
            System.out.println(e.getMessage()); // Handle any SQL exceptions
        }
        // Log the transaction with the book ID replaced in the SQL query
        DBHistoryLogger.logTransaction(sql.replaceFirst("\\?", String.valueOf(bookId)));
    }

    // Method to list all books in the database
    @Override
    public void listBooks() {
        // SQL query for selecting all books from the books table
        String sql = "SELECT * FROM books";
        try (Connection conn = DBManager.connect(); // Establish connection
             Statement stmt = conn.createStatement(); // Create a statement
             ResultSet rs = stmt.executeQuery(sql)) { // Execute the query and get the result set
            // Iterate through the result set and display each book's details
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Title: " + rs.getString("title") +
                        ", Author: " + rs.getString("author") +
                        ", Available: " + (rs.getInt("isAvailable") == 1 ? "Yes" : "No"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()); // Handle any SQL exceptions
        }
    }
}
