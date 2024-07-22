// Functional Interface & Using Lambda Functions

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}


public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface instance = () -> {System.out.println("Hello, world!");
        System.out.println("Hello, world!");
    };

        // Calling the method
        instance.myMethod();
    }
}
