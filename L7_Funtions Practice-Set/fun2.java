// Write a function to print the sum of all odd numbers from 1 to n.


import java.util.*;

public class fun2 {
    public static void printOddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printOddNumbers(n);  
        sc.close();
    }
}

