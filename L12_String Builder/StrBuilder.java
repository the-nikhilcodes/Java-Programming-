import java.util.*;
public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("Shyam");
        System.out.println(sb);

        // //char at index 0
        // System.out.println((sb.charAt(0)));

        // //set char at index
        // sb.setCharAt(0, 'P');
        // System.out.println(sb );


        sb.insert(0, 'G');
        System.out.println(sb);

        //delete the extra G
        sb.delete(0, 1);
        System.out.println(sb);

    }
}
