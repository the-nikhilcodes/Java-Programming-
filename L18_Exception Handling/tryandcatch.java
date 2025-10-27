public class tryandcatch {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;  // This will cause an exception

            int result = numerator / denominator; // risky code
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // This block handles division by zero errors
            System.out.println("Error: Cannot divide by zero!");

        } catch (Exception e) {
            // This block handles any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // This block always executes, whether an exception occurs or not
            System.out.println("Program execution completed.");
        }
    }
}
