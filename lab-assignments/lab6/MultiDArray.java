import java.util.Random;

public class MultiDArray {
    public static void main(String[] args) {
        int x = 3, y = 3, z = 3;
        int[][][] arr = new int[x][y][z];
        Random rand = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = rand.nextInt(100);   // Initializing the array with random integers from 0 to 99
                }
            }
        }

        // Displaying the array
        System.out.println("3D Array:");
        for (int i = 0; i < x; i++) {
            System.out.println("Array Layer " + i + ":");
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Finding maximum value in the array
        int max = arr[0][0][0];
        int sum = 0;    // For calculating the average in the later stage
        int count = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                    sum += arr[i][j][k];
                    count++;
                }
            }
        }
        System.out.println("Maximum value: " + max);

        // Calculating for average
        double avg = (double) sum / count;
        System.out.println("Average value: " + avg);
    }
}