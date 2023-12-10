// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Derived class inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Another class inheriting from Car (Multilevel Inheritance)
class SportsCar extends Car {
    void accelerate() {
        System.out.println("SportsCar is accelerating.");
    }
}

// Main class to test multilevel inheritance
class MultilevelInheritanceExample1 {
    public static void main(String[] args) {
        // Create an instance of the SportsCar class
        SportsCar mySportsCar = new SportsCar();

        // Access methods from different levels of inheritance
        mySportsCar.start();      // Method from Vehicle class
        mySportsCar.drive();      // Method from Car class
        mySportsCar.accelerate(); // Method from SportsCar class
    }
}

