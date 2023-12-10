class AreaCalculator {

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public static double calculateArea(int sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        // Calculate and display the area of a circle
        double circleArea = calculateArea(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Calculate and display the area of a triangle
        double triangleArea = calculateArea(4.0, 7.0);
        System.out.println("Area of Triangle: " + triangleArea);

        // Calculate and display the area of a square
        double squareArea = calculateArea(5);
        System.out.println("Area of Square: " + squareArea);
    }
}
