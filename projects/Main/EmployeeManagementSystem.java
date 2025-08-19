import java.sql.*;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static final String URL = "jdbc:mysql://localhost:3306/PROJECT_EMS";
    private static final String USER = env.getDBUser();;
    private static final String PASSWORD = env.getDBPassword();

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connection successful!");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        
                        System.out.print("Enter Employee Email-ID: ");
                        String email = scanner.nextLine();

                        System.out.print("Enter Employee Designation: ");
                        String designation = scanner.nextLine();

                        System.out.print("Enter Employee Department ID: ");
                        int dept_id = scanner.nextInt();

                        addEmployee(connection, name, email, designation, dept_id);
                        break;

                    case 2:
                        viewEmployees(connection);
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to update: ");
                        int idToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Consume newline left-over

                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter new designation: ");
                        String newDesignation = scanner.nextLine();

                        updateEmployee(connection, idToUpdate, newName, newDesignation);
                        break;

                    case 4:
                        System.out.print("Enter employee ID to delete: ");
                        int idToDelete = scanner.nextInt();
                        deleteEmployee(connection, idToDelete);
                        break;

                    case 5:
                        scanner.close();
                        connection.close();
                        System.out.println("Database connection closed.");
                        return;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addEmployee(Connection connection, String name, String email, String designation, int dept_id) {
        String query = "INSERT INTO Employee_Info (Name, Email, Designation, Dept_ID) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, designation);
            pstmt.setInt(4, dept_id);
            pstmt.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
        }
    }

    private static void viewEmployees(Connection connection) {
        String query = "SELECT * FROM Employee_Info";

        try (Statement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Employee List: ");
            while (rs.next()) {
                int id = rs.getInt("Emp_ID");
                String name = rs.getString("Name");
                String email = rs.getString("Email");
                String designation = rs.getString("Designation");
                int dept_id = rs.getInt("Dept_ID");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Designation: " + designation + ", Department ID: " + dept_id);
            }
        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
        }

    }

    private static void updateEmployee(Connection connection, int idToUpdate, String newName, String newDesignation) {
        String query = "UPDATE Employee_Info SET Name = ?, Designation = ? WHERE Emp_ID = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, newDesignation);
            pstmt.setInt(3, idToUpdate);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee updated successfully!");
            } else {
                System.out.println("No employee found with ID: " + idToUpdate);
            }
        } catch (SQLException e) {
            System.err.println("Error updating employee: " + e.getMessage());
        }
    }

    private static void deleteEmployee(Connection connection, int idToDelete) {
        String query = "DELETE FROM Employee_Info WHERE Emp_ID = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, idToDelete);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("No employee found with ID: " + idToDelete);
            }
        } catch (SQLException e) {
            System.err.println("Error deleting employee: " + e.getMessage());
        }
    }
}