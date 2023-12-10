// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Derived class inheriting from Shape
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}

// Another class inheriting from Circle (Multilevel Inheritance)
class ColoredCircle extends Circle {
    void setColor(String color) {
        System.out.println("Setting color to: " + color);
    }
}

// Main class to test multilevel inheritance
public class MultilevelInheritanceExample2 {
    public static void main(String[] args) {
        // Create an instance of the ColoredCircle class
        ColoredCircle myColoredCircle = new ColoredCircle();

        // Access methods from different levels of inheritance
        myColoredCircle.draw();       // Method from Shape class
        myColoredCircle.drawCircle(); // Method from Circle class
        myColoredCircle.setColor("Red"); // Method from ColoredCircle class
    }
}

