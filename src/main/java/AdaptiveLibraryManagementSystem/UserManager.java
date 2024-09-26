package AdaptiveLibraryManagementSystem;

import java.sql.*;

public class UserManager implements MemberDBTransactions{

    @Override
    public void addMember(String name) {
        String sql = "INSERT INTO users (name) VALUES (?)";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void removeMember(int memberId) {
        String sql = "DELETE FROM USERS WHERE ID = (?)";
        try {
            Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, memberId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void listMembers() {
        String sql = "SELECT * FROM users";
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
    public void search(String searchField, String searchString) {
    }

}
