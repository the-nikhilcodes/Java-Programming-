// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of  age > 18 is eligible to vote.

import java.util.*;

public class fun_5 {
    public static boolean votingMachin(int age) {
        if (age >= 18) {
            System.out.println("Congrats! You are eligible for voting.");
            return true;
        } else {
            System.out.println("Sorry, you are not eligible to vote.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        votingMachin(age); 
        sc.close();
    }
}

