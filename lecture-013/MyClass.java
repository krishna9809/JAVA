// Multiple Inheritance and Default Methods

interface InterfaceA {
    default void defaultMethod() {
        System.out.println("InterfaceA default method");
    }
}

 interface InterfaceB {
    default void defaultMethod() {
        System.out.println("InterfaceB default method");
    }
}

public class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
        InterfaceB.super.defaultMethod();

        // System.out.println("MyClass implementation");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.defaultMethod();
        // Outputs:
        // InterfaceA default method
        // InterfaceB default method
        // MyClass implementation
    }
}
