package AdaptiveLibraryManagementSystem;
// imported libraries needed to interact with SQLite database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Definition of DBManager
public class DBManager {
    // Declare and initialize private
    private static final String URL = "jdbc:sqlite:myLibrary.db";

    public static Connection connect() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection(URL);
        System.out.println(conn.getMetaData().getDriverName());

        return conn;
    }

    public static void initializeDatabase() {
        String booksTable = "CREATE TABLE IF NOT EXISTS books (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "title TEXT NOT NULL," +
                "author TEXT NOT NULL," +
                "isAvailable INTEGER NOT NULL DEFAULT 1);";

        String usersTable = "CREATE TABLE IF NOT EXISTS users (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL);";

        Connection dbConnection;
        try {
            dbConnection = connect();
            Statement stmt = dbConnection.createStatement();
            stmt.execute(booksTable);
            stmt.execute(usersTable);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
