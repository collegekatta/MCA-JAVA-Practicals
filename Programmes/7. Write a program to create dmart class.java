import java.util.Scanner;

class Dmart {
    private int productId;
    private String productName;
    private double rate;
    private int quantity;

    // Constructor to initialize values
    public Dmart(int productId, String productName, double rate, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.rate = rate;
        this.quantity = quantity;
    }

    // Method to calculate payable amount with discount
    public double calculatePayableAmount() {
        double totalAmount = rate * quantity;
        double discountRate = 0.0;

        // Apply discount based on totalAmount
        if (totalAmount >= 5000) {
            discountRate = 0.20;
        } else if (totalAmount >= 3000) {
            discountRate = 0.15;
        } else if (totalAmount >= 2000) {
            discountRate = 0.10;
        }

        double discount = totalAmount * discountRate;
        double payableAmount = totalAmount - discount;

        return payableAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();

        System.out.print("Enter Product Name: ");
        String productName = scanner.next();

        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Create an instance of Dmart
        Dmart dmart = new Dmart(productId, productName, rate, quantity);

        // Calculate and display payable amount with discount
        double payableAmount = dmart.calculatePayableAmount();
        System.out.println("Payable Amount with Discount: " + payableAmount);
    }
}
