// User-defined exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class ExceptionExample {
    // Method to test built-in exception
    public static void testBuiltInException() {
        try {
            int[] numbers = {1, 2, 3};
            // Trying to access an index that is out of bounds
            int value = numbers[5];
            System.out.println("Value: " + value);  // This line will not be reached
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Built-in Exception: " + e.getMessage());
        }
    }

    // Method to test user-defined exception
    public static void testUserDefinedException() {
        try {
            throw new CustomException("This is a user-defined exception.");
        } catch (CustomException e) {
            System.out.println("User-defined Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Test the built-in exception
        System.out.println("Testing Built-In Exception:");
        testBuiltInException();

        // Test the user-defined exception
        System.out.println("\nTesting User-Defined Exception:");
        testUserDefinedException();
    }
}
