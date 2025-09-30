import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);

    // STRING OPERATION
    //Concatenation
    // String FirstName = "Nikhil";
    // String lastName = " Agrahari";
    // String fullname = FirstName + lastName;
    // System.out.println(fullname.length());

    //charAt
    // for (int i = 0; i<fullname.length(); i++){
    //     System.out.println(fullname.charAt(i));
    // }

    //compareTo()
    String Name1 = "Ram";
    String Name2 = "Ram";

   //  CASE-1 S1 > S2   :+ve value
   //  CASE-2 S1 == S2  :0
   //  CASE-3 S1 < S2   :-ve VAlue

   if (Name1.compareTo(Name2) == 0) {
    System.out.println("Strings are equal");
   } else {
    System.out.println("Strings are not equal");
   }
    }
}
