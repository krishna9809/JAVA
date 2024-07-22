// Static Method

 interface MyInterface {
    // Static method in an interface
    static void staticMethod() {
        System.out.println("Static method in interface.");
    }
}

public class StaticMethodInInterfaceExample {
    public static void main(String[] args) {
        // Calling the static method from the interface
        MyInterface.staticMethod(); // Outputs: Static method in interface.
    }
}


// public class StaticMethodExample {
//     // Static method
//     public static void displayMessage() {
//         System.out.println("Hello, this is a static method.");
//     }

//     public static void main(String[] args) {
//         // Calling the static method without creating an instance of the class
//         StaticMethodExample.displayMessage(); // Outputs: Hello, this is a static method.
//     }
// }
