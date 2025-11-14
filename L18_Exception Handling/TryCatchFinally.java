public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 5 / 0; // risky code
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
