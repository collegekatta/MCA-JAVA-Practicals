import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Call method with void
        addNumbersWithVoid(num1, num2);

        // Call method without void
        double sum = addNumbersWithoutVoid(num1, num2);
        System.out.println("Sum of the numbers  (without void method): " + sum);
    }

    // Void method for addition
    public static void addNumbersWithVoid(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of the numbers (void method): " + sum);
    }

    // Method that returns the sum
    public static double addNumbersWithoutVoid(double a, double b) {
        return a + b;
    }
}
