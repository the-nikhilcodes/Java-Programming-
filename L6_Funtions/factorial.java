import java.util.*;

public class factorial {
    public static void printfactotia(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfactotia(n);
        sc.close();
    }
}
