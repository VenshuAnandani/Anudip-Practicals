import java.sql.*;
import java.util.Scanner;

public class BasicJdbc {
    private static final String URL = "jdbc:mysql://localhost:3306/PROJECT_BASIC_JDBC";
    private static final String USER = env.getDBUser();
    private static final String PASSWORD = env.getDBPassword();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            while (true) {
                System.out.println("\n1. Insert\n2. Read by ID\n3. Update by ID\n4. Delete by ID\n5. Exit");
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();

                        System.out.print("Enter City: ");
                        String city = scanner.nextLine();
                        insertRecord(conn, name, age, email, dept, city);
                        break;

                    case 2:
                        System.out.print("Enter ID to read: ");
                        int id = scanner.nextInt();
                        readById(conn, id);
                        break;

                    case 3:
                        System.out.print("Enter ID to update: ");
                        int uId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter new Name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter new Age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter new Email: ");
                        String newEmail = scanner.nextLine();

                        System.out.print("Enter new Department: ");
                        String newDept = scanner.nextLine();

                        System.out.print("Enter new City: ");
                        String newCity = scanner.nextLine();
                        updateById(conn, uId, newName, newAge, newEmail, newDept, newCity);
                        break;

                    case 4:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteById(conn, deleteId);
                        break;

                    case 5:
                        scanner.close();
                        conn.close();
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertRecord(Connection conn, String name, int age, String email, String dept, String city) {
        String query = "INSERT INTO students (name, age, email, department, city) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setString(4, dept);
            ps.setString(5, city);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) inserted.");
        } catch (SQLException e) {
            System.out.println("Error inserting record: " + e.getMessage());
        }
    }

    private static void readById(Connection conn, int id) {
        String query = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Age: " + rs.getInt("age"));
                    System.out.println("Email: " + rs.getString("email"));
                    System.out.println("Department: " + rs.getString("department"));
                    System.out.println("City: " + rs.getString("city"));
                } else {
                    System.out.println("Record not found.");
                }
            } catch (SQLException e) {
                System.out.println("Error reading record: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Error preparing statement: " + e.getMessage());
        }
    }

    private static void updateById(Connection conn, int id, String name, int age, String email, String dept,
            String city) {
        String query = "UPDATE students SET name=?, age=?, email=?, department=?, city=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setString(4, dept);
            ps.setString(5, city);
            ps.setInt(6, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) updated.");
        } catch (SQLException e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }

    private static void deleteById(Connection conn, int id) {
        String query = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) deleted.");
        } catch (SQLException e) {
            System.out.println("Error deleting record: " + e.getMessage());
        }
    }
}