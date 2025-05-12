import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result = new int[2][2];

        // Input for matrix A
        System.out.println("Enter 4 elements for Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        // Input for matrix B
        System.out.println("Enter 4 elements for Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        // Menu
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose (of Matrix A)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Addition
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][j] + b[i][j];
                System.out.println("Result of Addition:");
                break;

            case 2:
                // Multiplication
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
                System.out.println("Result of Multiplication:");
                break;

            case 3:
                // Transpose of A
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[j][i];
                System.out.println("Transpose of Matrix A:");
                break;

            default:
                System.out.println("Invalid choice!");
                
        }

        // Display the result
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
