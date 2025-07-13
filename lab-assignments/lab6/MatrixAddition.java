import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns in matrix: ");
        int cols = sc.nextInt();

        Integer[][] mat1 = new Integer[rows][cols];
        Integer[][] mat2 = new Integer[rows][cols];
        Integer[][] res = new Integer[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Addition of both matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}