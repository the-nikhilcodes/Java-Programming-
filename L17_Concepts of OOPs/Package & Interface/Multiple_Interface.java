

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class Machine implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Multiple_interface {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.print();
        m.scan();
    }
}
