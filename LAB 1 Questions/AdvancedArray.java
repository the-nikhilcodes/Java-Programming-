import java.util.*;

public class AdvancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 5, 9, 34, 2, 45, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // 1. Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 2. Binary Search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr, key);

        if (index >= 0)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");

        // 3. Reverse Array (Manual Logic)
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(rev));

        // 4. Maximum and Minimum
        int max = arr[arr.length - 1];
        int min = arr[0];
        System.out.println("Minimum: " + min + ", Maximum: " + max);

        // 5. Sum of all elements
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum of Elements: " + sum);
    }
}