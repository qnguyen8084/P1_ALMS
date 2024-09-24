package AdaptiveLibraryManagementSystem;

import java.sql.*;

public class UserManager {

    private final Connection conn;

    public UserManager(Connection conn) {
        this.conn = conn;
    }

    public void addUser(String name) {
        String sql = "INSERT INTO users (name) VALUES (?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listUsers() {
        String sql = "SELECT * FROM users";
        try {
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
}
