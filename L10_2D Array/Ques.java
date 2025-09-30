// Qs. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs. 

import java.util.*;
public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows : ");
        int rows = sc.nextInt();
         System.out.print("Enter the size of cols :");
        int cols = sc.nextInt();

        int [][] numbers =new int[rows][cols];

        // input Rows
        for (int i=0 ; i<rows; i++){
            // Columns
            for (int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter the deised element from matrix");
        int x = sc.nextInt();
        for (int i = 0; i<rows; i++){
            for (int j=0; j<cols ; j++){
                //Compare with X
                if (numbers[i][j] == x) {
                    System.out.println("X is found at location (" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
