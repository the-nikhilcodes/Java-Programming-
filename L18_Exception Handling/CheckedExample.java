import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt"); // file may not exist
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
