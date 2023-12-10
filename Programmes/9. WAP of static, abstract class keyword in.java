// Abstract class with abstract and non-abstract methods
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Non-abstract method
    void display() {
        System.out.println("This is a shape.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in the Shape class.");
    }
}

// Concrete subclass implementing the abstract class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method from the superclass
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test static and abstract class
class StaticAbstractClassExample {
    public static void main(String[] args) {
        // Accessing static method without creating an instance
        Shape.staticMethod();

        // Creating an instance of the Circle class
        Circle circle = new Circle(5.0);

        // Calling methods from the abstract class
        circle.display(); // Non-abstract method
        double area = circle.calculateArea(); // Abstract method
        System.out.println("Area of the circle: " + area);
    }
}
