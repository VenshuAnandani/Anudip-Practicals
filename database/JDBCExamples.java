import java.sql.*;

public class JDBCExamples {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/JDBCDemo";
    private static final String USER = env.getDBUser();
    private static final String PASSWORD = env.getDBPassword();

    public static void main(String[] args) {
        try {
            // Step 1: Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");

            // Step 3: Create Table
            createTable(connection);

            // Step 4: Insert Data
            insertData(connection, "Ritesh", "ritesh@example.com");
            insertData(connection, "Venshu", "venshu@example.com");

            // Step 5: Retrieve Data
            retrieveData(connection);

            // Step 6: Update Data
            updateData(connection, 1, "john.doe@example.com");

            // Step 7: Delete Data
            deleteData(connection, 2);

            // Step 8: Close Connection
            connection.close();
            System.out.println("Database connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Create Table Method
    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "email VARCHAR(100) UNIQUE)";
        
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'users' created successfully!");
        }
    }

    // Insert Data Method
    private static void insertData(Connection connection, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("Inserted: " + name);
        }
    }

    // Retrieve Data Method
    private static void retrieveData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM users";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            System.out.println("User Data:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }
        }
    }

    // Update Data Method
    private static void updateData(Connection connection, int id, String newEmail) throws SQLException {
        String updateSQL = "UPDATE users SET email = ? WHERE id = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(updateSQL)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Updated email for ID: " + id);
        }
    }

    // Delete Data Method
    private static void deleteData(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted user with ID: " + id);
        }
    }
}