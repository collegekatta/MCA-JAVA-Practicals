// Interface XYZ
interface XYZ {
    void show();
}

// Interface GHI extending XYZ
interface GHI extends XYZ {
    void print();
}

// Class implementing GHI
class MyClass implements GHI {
    @Override
    public void show() {
        System.out.println("Show method from interface XYZ");
    }

    @Override
    public void print() {
        System.out.println("Print method from interface GHI");
    }
}

// Main class
class InterfaceExample {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass obj = new MyClass();

        // Calling methods from interfaces
        obj.show();
        System.out.println("");
        obj.print();
    }
}
