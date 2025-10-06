public class FibonacciRecursion {
    // Recursive method for nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base cases: 0 and 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
    }

    public static void main(String[] args) {
        int terms = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
