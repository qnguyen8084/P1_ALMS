/*
 * Quy Nguyen
 * CSC635
 * Adaptive Library Management System
 * UserManager.java
 * Sept 7, 2024
 */

package AdaptiveLibraryManagementSystem;

import java.sql.*;

public class UserManager implements UserOperations {

    @Override
    public void addMember(String name) {
        String sql = "INSERT INTO members (name) VALUES (?)";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        DBHistoryLogger.logTransaction(sql.replaceFirst("\\?", name));
    }

    @Override
    public void removeMember(int memberId) {
        String sql = "DELETE FROM members WHERE ID = (?)";
        try (Connection conn = DBManager.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, memberId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        DBHistoryLogger.logTransaction(sql.replaceFirst("\\?", String.valueOf(memberId)));
    }

    @Override
    public void listMembers() {
        String sql = "SELECT * FROM members";
        try (Connection conn = DBManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
