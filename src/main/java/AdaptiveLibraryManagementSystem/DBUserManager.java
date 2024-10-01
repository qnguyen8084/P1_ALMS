/*
 * Quy Nguyen
 * Dhruv Shah
 * CS635
 * Adaptive Library Management System
 * DBUserManager.java
 * Sun, Sep 29 2024
 */

package AdaptiveLibraryManagementSystem;

import java.sql.*;

/**
 * The DBUserManager class implements the DBUserOperations interface and
 * manages the database operations for library members, such as adding,
 * removing, and listing members.
 */
public class DBUserManager implements DBUserOperations {

    /**
     * Adds a new member to the members table in the database.
     * 
     * @param name The name of the new member to be added.
     */
    @Override
    public void addMember(String name) {
        String sql = "INSERT INTO members (name) VALUES (?)";  // SQL query to add a new member
        try (Connection conn = DBManager.connect();              // Establish database connection
             PreparedStatement stmt = conn.prepareStatement(sql)) { // Prepare SQL statement with the given query
            stmt.setString(1, name);                              // Set the name parameter in the query
            stmt.executeUpdate();                                 // Execute the query to insert the member
        } catch (SQLException e) {
            System.out.println(e.getMessage());                   // Print SQL error if any occurs
        }

        // Log the transaction to history by replacing the first '?' with the member name
        DBHistoryLogger.logTransaction(sql.replaceFirst("\\?", name));
    }

    /**
     * Removes a member from the members table in the database based on the member ID.
     * 
     * @param memberId The ID of the member to be removed.
     */
    @Override
    public void removeMember(int memberId) {
        String sql = "DELETE FROM members WHERE ID = (?)";        // SQL query to delete a member by ID
        try (Connection conn = DBManager.connect();              // Establish database connection
             PreparedStatement stmt = conn.prepareStatement(sql)) { // Prepare SQL statement with the given query
            stmt.setInt(1, memberId);                            // Set the memberId parameter in the query
            stmt.executeUpdate();                                // Execute the query to delete the member
        } catch (SQLException e) {
            System.out.println(e.getMessage());                  // Print SQL error if any occurs
        }

        // Log the transaction to history by replacing the first '?' with the member ID
        DBHistoryLogger.logTransaction(sql.replaceFirst("\\?", String.valueOf(memberId)));
    }

    /**
     * Lists all the members in the members table by retrieving their details from the database.
     */
    @Override
    public void listMembers() {
        String sql = "SELECT * FROM members";                    // SQL query to retrieve all members
        try (Connection conn = DBManager.connect();              // Establish database connection
             Statement stmt = conn.createStatement();            // Create a statement object for executing the query
             ResultSet rs = stmt.executeQuery(sql)) {            // Execute the query and get the result set
            while (rs.next()) {
                // Loop through the result set and print member details
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());                  // Print SQL error if any occurs
        }
    }
}
