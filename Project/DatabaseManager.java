import java.sql.*;

class DatabaseManager {
    Connection con;

    DatabaseManager() {
        try {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "password"   // change your password
            );
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
        }
    }

    // CREATE
    void addStudent(Student s) {
        try {
            String query = "INSERT INTO students VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, s.id);
            ps.setString(2, s.name);
            ps.setDouble(3, s.marks);
            ps.setString(4, s.grade);
            ps.executeUpdate();
            System.out.println("Student Added!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    void displayStudents() {
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getDouble(3) + " " +
                    rs.getString(4)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    void updateStudent(int id, double marks, String grade) {
        try {
            String q = "UPDATE students SET marks=?, grade=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setDouble(1, marks);
            ps.setString(2, grade);
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("Updated!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    void deleteStudent(int id) {
        try {
            String q = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Deleted!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}