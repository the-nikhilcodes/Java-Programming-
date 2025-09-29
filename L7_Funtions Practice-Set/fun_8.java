
// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class fun_8 {
    public static int power( int x, int n){
        int result = 1;

        for ( int i = 1; i<=n; i++){
            result = result * x;
        }

      return result;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        int c = power(x, n);
        System.out.println( x + " ^ " + n + " = " + c );
        sc.close();
    }
}
