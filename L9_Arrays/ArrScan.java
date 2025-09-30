import java.util.*;
public class ArrScan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int numbers[] = new int [size];

        //FOr input 
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
 
        //For Output
        for (int i=0; i<size; i++){
            System.out.println(numbers[i]);
        } 
        sc.close();
    }
}
