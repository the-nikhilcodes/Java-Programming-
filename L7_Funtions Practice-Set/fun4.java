// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class fun4 {
    public static double circumference(double r){
        return 2 * 3.14 * r;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter the radius value");
        double r = sc.nextDouble();
        double c = circumference(r);
        System.out.println(c);
        sc.close();
    }
}
