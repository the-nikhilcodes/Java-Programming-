
// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class fun1 {
    public static int printAVG (int a, int b , int c){
        int n = 3;
        int avg = (a + b + c)/n;
        return (avg);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter the value of a, b, c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = printAVG(a,b,c);
        System.out.println(avg);
        sc.close();
    }
}
