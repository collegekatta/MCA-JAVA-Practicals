package mypack;
import package1.A; // Importing class A from package1

public class B {
    public static void main(String[] args) {
        // Creating an instance of class A
        A aObject = new A();

        // Calling the msg method from class A
        aObject.msg();
    }
}

