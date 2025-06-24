import java.sql.*;

public class DBConn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = env.getDBUser();
        String password = env.getDBPassword();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection successful!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Stud_Info");

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("Stud_ID") +
                                ", Name: " + rs.getString("Stud_Name") +
                                ", Age: " + rs.getInt("Age"));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found!");
            e.printStackTrace();
        }
    }
}