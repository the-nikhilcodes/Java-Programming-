// File: ExceptionExample.java
public class ExceptionExample {

    // Method that may throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Manually throwing an exception using 'throw'
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            checkAge(15);  // This will throw an exception
            System.out.println("This line will not execute if exception is thrown.");
        }
        catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            // Always executes, whether exception occurs or not
            System.out.println("Finally block executed — cleaning up resources.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
