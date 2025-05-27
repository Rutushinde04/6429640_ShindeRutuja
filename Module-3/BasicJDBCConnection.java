import java.sql.*;

public class BasicJDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdb";
        String user = "root";
        String pass = "password";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

