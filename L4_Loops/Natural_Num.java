import java.util.Scanner;

public class Natural_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Natural numbers from 1 to " + n + " are:");

        // Using for loop
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close(); // Closing the scanner
    }
}