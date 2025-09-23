import java.util.*;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch (Button) {
            case 1:
                System.out.println(" Hello Bhai kya Hal hai ");
                break;
            case 2:
                System.out.println(" Namaste  ");
                break;
            case 3:
                System.out.println(" Aur Sab badhiya hai na  ");
                break;
            case 4:
                System.out.println(" Koi Problem Ho to bta dena  ");
                break;

            default:
                System.out.println("Invalid Button");
                break;
        }
         sc.close();

    }

}