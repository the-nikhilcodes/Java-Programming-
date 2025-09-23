import java.util.*;
public class Condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if (age>18) {
            System.out.println("Your are Adult");
            System.out.println();
        }else{
            System.out.println("Sorry You are not a Adult");
            sc.close();
        }
    }
}