
import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the size of cols");
        int cols = sc.nextInt();

        System.out.println("Enter the element in the array");

        int[][] numbers = new int[rows][cols];

        // input Rows
        for (int i = 0; i < rows; i++) {
            // Columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
