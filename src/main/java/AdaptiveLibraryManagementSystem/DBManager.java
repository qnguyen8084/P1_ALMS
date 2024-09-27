/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBManager.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;
// imported libraries needed to interact with SQLite database
import java.sql.*;

// Definition of DBManager
public class DBManager implements DBTransactions {

    // Declare and initialize private static final String URL with location of myLibrary.db
    private static final String URL = "jdbc:sqlite:myLibrary.db";

    // Method to create table if table does not exist
    public DBManager() {
        // Calls createTables()
        createTables();
    }

    // Definition of createTables method that creates 3 tables in our relational database
    // for persistent storage.
    private void createTables() {

        // Initialize a String variable createBooksTable with an SQL string to create
        // a table named books with 4 columns; id, title, author, and isAvailable
        // if table does not exist
        String createBooksTable = "CREATE TABLE IF NOT EXISTS books(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "title TEXT NOT NULL," +
                "author TEXT NOT NULL," +
                "isAvailable INTEGER NOT NULL DEFAULT 1)";

        // Initialize a String variable createMembersTable with an SQL string to create
        // a table named members with 2 columns; id and name if table does not exist
        String createMembersTable = "CREATE TABLE IF NOT EXISTS members(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL)";

        // Initialize a String variable createLoansTable with an SQL string to create
        // a table named loans with 3 columns; id, bookId, and memberId where this bookId,
        // memberId will be referenced to id entries in books and members table, respectively.
        String createLoansTable = "CREATE TABLE IF NOT EXISTS loans(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "bookId INTEGER NOT NULL," +
                "memberId INTEGER NOT NULL," +
                "FOREIGN KEY (bookId) REFERENCES books(id)," +
                "FOREIGN KEY (memberId) REFERENCES members(id))";

        // Initialize Connection conn object to be initialized with Connection object
        // returned from DriverManager.getConnection(URL);
        // Statements are passed to try because I learned somewhere this will also
        // close conn connection after method is done with execution.
        // This try block will create the tables in the database if they don't exist
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(createBooksTable);
            stmt.execute(createMembersTable);
            stmt.execute(createLoansTable);
        } catch (SQLException e) { // throws an exception if SQL exception is caught.
            throw new RuntimeException(e);
        }
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    @Override
    public void addMember(String name) {
        String sql = "INSERT INTO members (name) VALUES (?)";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void removeMember(int memberId) {
        String sql = "DELETE FROM members WHERE ID = (?)";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, memberId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listMembers() {
        String sql = "SELECT * FROM members";
        try {
            Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

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
    }

    @Override
    public void removeBook(int bookId) {
        String sql = "DELETE FROM BOOKS WHERE ID = (?)";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listBooks() {
        String sql = "SELECT * FROM books";
        try {
            Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
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

    @Override
    public void borrowBook(int memberId, int bookId) {

        String sql = "UPDATE books SET isAvailable = 0 WHERE id = ?";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void returnBook(int memberId, int bookId) {

        String sql = "UPDATE books SET isAvailable = 1 WHERE id = ?";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listLoans() {
    }

    @Override
    public void search(String searchField, String searchString) {
    }

    public void returnBook(int bookId) {
        String sql = "UPDATE books SET isAvailable = 1 WHERE id =?";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bookId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
