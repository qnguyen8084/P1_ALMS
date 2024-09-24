package AdaptiveLibraryManagementSystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class DBManagerTest {

    @org.junit.jupiter.api.Test
    void connect() throws SQLException, ClassNotFoundException {
        Connection conn = DBManager.connect();
        assertEquals("SQLite JDBC", conn.getMetaData().getDriverName());
    }

    @org.junit.jupiter.api.Test
    void initializeDatabase() {
        DBManager.initializeDatabase();
    }
}