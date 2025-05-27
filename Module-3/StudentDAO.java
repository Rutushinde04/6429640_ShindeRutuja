import java.sql.*;

public class StudentDAO {
    private Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }

    public void insertStudent(int id, String name, int age) throws SQLException {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.executeUpdate();
        }
    }

    public void updateStudentAge(int id, int newAge) throws SQLException {
        String sql = "UPDATE students SET age = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, newAge);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }
}

