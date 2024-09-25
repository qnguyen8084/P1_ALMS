package AdaptiveLibraryManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
    private static final String URL = "jdbc:sqlite:myLibrary.db";

    public static Connection connect() throws ClassNotFoundException, SQLException {
        //Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection(URL);
        System.out.println(conn.getMetaData().getDriverName());
        // System.out.println("\u001B[34m" + "You have successfully connected to SQLite database" + "\u001B[0m");
        return conn;
    }

    public static void initializeDatabase() {
        String booksTable = "CREATE TABLE IF NOT EXISTS books (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "title TEXT NOT NULL," +
                "author TEXT NOT NULL," +
                "available INTEGER NOT NULL DEFAULT 1);";

        String usersTable = "CREATE TABLE IF NOT EXISTS users (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL);";

        Connection dbConnection;
        try {
            dbConnection = connect();
            Statement stmt = dbConnection.createStatement();
            stmt.execute(booksTable);
            stmt.execute(usersTable);
            /*
            System.out.println("""
                    \u001B[34mLibrary database has successfully been initialized

                    \u001B[0m""");

             */
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
