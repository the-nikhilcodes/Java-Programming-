import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("✅ File copied successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
