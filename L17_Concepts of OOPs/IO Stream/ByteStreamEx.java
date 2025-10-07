
import java.io.*;

public class ByteStreamEx{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("input.jpg");   // source
            FileOutputStream fout = new FileOutputStream("output.jpg"); // destination

            int i;
            while ((i = fin.read()) != -1) {   // read byte by byte
                fout.write(i);                 // write byte by byte
            }

            fin.close();
            fout.close();
            System.out.println("File copied successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
