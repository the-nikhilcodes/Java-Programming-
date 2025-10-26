
class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Processing a generic payment of $" + amount);
    }
}


class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + cardNumber);
    }
}


class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " for account: " + email);
    }
}

class CryptoPayment extends PayPalPayment {
    private String walletAddress;

    public CryptoPayment(double amount, String email, String walletAddress) {
        super(amount, email);
        this.walletAddress = walletAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing crypto payment of $" + amount + " to wallet: " + walletAddress);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(150.0, "1234-5678-9012-3456");
        Payment p2 = new PayPalPayment(75.5, "user@example.com");
        Payment p3 = new CryptoPayment(300.0, "crypto@example.com", "0xABC123XYZ");

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
