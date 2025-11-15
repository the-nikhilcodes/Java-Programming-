import java.io.*;

class ThrowsExample {
    static void readFile() throws IOException {
        FileReader f = new FileReader("data.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled IOException");
        }
    }
}
