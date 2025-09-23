import java.util.*;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println(" +(Addition) " +(a+b));
        System.out.println(" -(Substraction)"+(a-b));
        System.out.println("  *(Multiplicaton)"+(a*b));
        System.out.println("  /(Division)"+(a/b));

sc.close();
   }
}