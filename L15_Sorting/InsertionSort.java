public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Time Complexity = O(n^2) in worst case
        // Insertion Sort
        for (int i = 1; i < arr.length; i++) { // start from 1
            int current = arr[i];
            int j = i - 1;

            // shifting larger elements to the right
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placement of current element
            arr[j + 1] = current;
        }

        System.out.println("Your Sorted Array is :");
        printArray(arr);
    }
}