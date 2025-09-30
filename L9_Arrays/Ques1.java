// Qs. Take an array as input from the user. Search for a given number x and print the index at which it occurs.

//Linear Search

import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        
        System.out.println("Enter the value of array");
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the desired Element which you want to find");
        int x = sc.nextInt();

        // Output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("X is found at index :" + i);
            }
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
