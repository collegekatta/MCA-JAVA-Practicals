public class ThisKeywordExample {
    // Instance variable
    private int number;

    // Constructor
    public ThisKeywordExample(int number) {
        // Using 'this' to refer to the instance variable
        this.number = number;
    }

    // Method using 'this' to refer to instance method
    public void displayNumber() {
        System.out.println("Number from instance variable: " + this.number);
        this.performCalculation(); // Calling another method using 'this'
    }

    // Another method
    private void performCalculation() {
        System.out.println("Performing calculation using the number: " + this.number);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        ThisKeywordExample example = new ThisKeywordExample(42);

        // Calling the method using 'this'
        example.displayNumber();
    }
}
