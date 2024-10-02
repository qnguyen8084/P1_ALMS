package AdaptiveLibraryManagementSystem;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DBManagerTest {

    // Test case for establishing a connection to the database
    @org.junit.jupiter.api.Test
    void connect() throws SQLException, ClassNotFoundException {
        // Establish a connection using DBManager
        Connection conn = DBManager.connect();
        
        // Assert that the JDBC driver used is SQLite
        assertEquals("SQLite JDBC", conn.getMetaData().getDriverName());
    }

    // Test case for initializing the database
    @org.junit.jupiter.api.Test
    void initializeDatabase() {
        // This tests the initialization of the DBManager object
        new DBManager();
        // Further assertions can be added here if necessary
    }
}
