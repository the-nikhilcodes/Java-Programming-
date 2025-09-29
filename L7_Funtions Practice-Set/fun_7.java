// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 


import java.util.*;
public class fun_7 {
    public static void main(String[] args) {
        int Positive = 0;
        int Negative = 0;
        int Zero = 0;
        
        System.out.println(" Enter 1 for Continue and 0 for stop");
        Scanner sc= new Scanner(System.in);
        int UserInput = sc.nextInt();

        while ( UserInput == 1 ) {
            System.out.println("Enter the number :");
            int num = sc.nextInt();

            if (num > 0) {
                Positive++;
            } else if (num < 0 ) {
                Negative++;
            } else {
                Zero++;
            }

            System.out.println(" Enter 1 for Continue and 0 for stop ");
            UserInput = sc.nextInt();  
        }
        System.out.println("Positive numbers are : " + Positive);
        System.out.println("Negative numbers are : " + Negative);
        System.out.println("Zero numbers are : "+ Zero);

        sc.close();
    }
}
