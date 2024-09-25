package AdaptiveLibraryManagementSystem;
// imported libraries needed to interact with SQLite database
import java.sql.*;

// Definition of DBManager
public class DBManager {
    // Declare and initialize private
    private static final String URL = "jdbc:sqlite:myLibrary.db";

    public DBManager() {
        createTables();
    }

    private void createTables() {
        String createBooksTable = "CREATE TABLE IF NOT EXISTS books(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "title TEXT NOT NULL," +
                "author TEXT NOT NULL," +
                "isAvailable BOOLEAN NOT NULL)";
        String createMembersTable = "CREATE TABLE IF NOT EXISTS members(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL)";
        String createCheckoutTable = "CREATE TABLE IF NOT EXISTS checkout(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "bookId INTEGER NOT NULL," +
                "memberId INTEGER NOT NULL," +
                "FOREIGN KEY (bookId) REFERENCES books(id)," +
                "FOREIGN KEY (memberId) REFERENCES members(id))";
        try(Connection conn = DriverManager.getConnection(URL);
        Statement stmt = conn.createStatement()){
            stmt.execute(createBooksTable);
            stmt.execute(createMembersTable);
            stmt.execute(createCheckoutTable);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
