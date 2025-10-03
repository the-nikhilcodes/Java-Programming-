//GET BIT Operation

// import java.util.*;

// public class Bits_Manipulation {
//     public static void main(String[] args) {

//     int n = 5;   //0101
//     int pos = 2;
//     int bitmask = 1<<pos;

//     if((bitmask & n) == 0) {
//         System.out.println("Bit was zero");
//     } else {
//         System.out.println("Bit was one ");
//     }
// }
// }

// SET BIT Operation

import java.util.*;

// public class Bits_Manipulation {
//     public static void main(String[] args) {

//     int n = 5;   //0101
//     int pos = 1;
//     int bitmask = 1<<pos;

//     int newNumber = bitmask | n;

//     System.out.println(newNumber);
//     }
// }

//Clear Bit Operation

// import java.util.*;

// public class Bits_Manipulation {
//     public static void main(String[] args) {

//     int n = 5;   //0101
//     int pos = 2;
//     int bitmask = 1<<pos;
//     int notBitmask = ~(bitmask);

//     int newNumber = notBitmask & n;

//     System.out.println(newNumber);
//     }
// }

//Update Bit Operation

import java.util.*;

public class Bits_Manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation Set or clear ");
        int oper = sc.nextInt();

        // oper =1 : set oper=0 : clear
        int n = 5; // 0101
        int pos = 1;

        int bitmask = 1 << pos;
        if (oper == 1) {
            // set oper
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else {
            int newbitmask = ~(bitmask);
            int newNumber = newbitmask & n;
            System.out.println(newbitmask);
        }
        sc.close();
    }
}
