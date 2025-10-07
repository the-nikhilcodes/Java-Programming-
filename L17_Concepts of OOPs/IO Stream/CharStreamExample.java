
import java.io.*;

public class CharStreamExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");

            int ch;
            while ((ch = fr.read()) != -1) {   // read char by char
                fw.write(ch);                  // write char by char
            }

            fr.close();
            fw.close();
            System.out.println("Text copied successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
