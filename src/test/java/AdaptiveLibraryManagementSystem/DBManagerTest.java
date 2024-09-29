/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * DBManagerTest.java
 * Sun, Sep 29 2024
 */

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
        new DBManager();
    }
}