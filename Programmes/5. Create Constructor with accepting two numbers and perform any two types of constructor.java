public class Calculator {
    private double result;

    // Constructor for addition
    public Calculator(double num1, double num2, String operation) {
        if ("add".equalsIgnoreCase(operation)) {
            this.result = num1 + num2;
        } else {
            System.out.println("Invalid operation. Defaulting to addition.");
            this.result = num1 + num2;
        }
    }

    // Constructor for multiplication
    public Calculator(double num1, double num2, boolean multiply) {
        if (multiply) {
            this.result = num1 * num2;
        } else {
            System.out.println("Invalid operation. Defaulting to multiplication.");
            this.result = num1 * num2;
        }
    }

    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        // Constructor with addition operation
        Calculator addCalculator = new Calculator(10.5, 5.2, "add");
        System.out.println("Result of addition: " + addCalculator.getResult());

        // Constructor with multiplication operation
        Calculator multiplyCalculator = new Calculator(7.0, 3.0, true);
        System.out.println("Result of multiplication: " + multiplyCalculator.getResult());
    }
}
