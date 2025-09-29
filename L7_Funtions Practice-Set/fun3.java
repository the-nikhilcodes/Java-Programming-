
// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class fun3 {
    public static int printGreaterNum(int a , int b){
    
        if (a > b ) {
          return a;      

        } else {
            return b;      
        }

    }

     public static void main(String[] args) {
        Scanner sc =new Scanner ( System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int num= printGreaterNum(a,b);

        System.out.println(num);
        sc.close();
    }
}
