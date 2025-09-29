import java.util.Scanner;

public class fun_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while ( a != b) {
            if (a > b ) {
                a = a - b;
            }else {
                b = b-a;
            }
        } 
        System.out.println( "Greatest of all digit" + " = "  + b);
        sc.close();
    } 
}
