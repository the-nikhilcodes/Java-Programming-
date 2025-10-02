public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // 15
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0

        // Relational Operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // Assignment Operators
        int c = 10;
        c += 5; // same as c = c + 5
        System.out.println("c after += 5: " + c); // 15

        // Unary Operators
        int d = 5;
        System.out.println("d++ = " + (d++)); // 5 (post-increment)
        System.out.println("Now d = " + d);   // 6
        System.out.println("++d = " + (++d)); // 7 (pre-increment)

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum is: " + max); // 10
    }
}
