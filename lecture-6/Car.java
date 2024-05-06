// // Static Members Example:

// class Counter {
//     private static int count = 0; // static variable
    
//     public Counter() {
//         count++; // increment count each time a Counter object is created
//     }
    
//     public static int getCount() { // static method
//         return count; // returns the count of Counter objects created
//     }
    
//     // other non-static methods...
// }

// public class Main {
//     public static void main(String[] args) {
//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();
        
//         System.out.println("Number of Counter objects created: " + Counter.getCount()); // Output: 3
//     }
// }


// // Final Members Example:

// //  class Circle {
// //     private final double PI = 3.14159; // final variable
    
// //     public double calculateArea(double radius) {
// //         return PI * radius * radius; // calculate area of circle
// //     }
    
// //     public final void displayInfo() { // final method
// //         System.out.println("This is a circle."); // display circle information
// //     }
    
// //     // other methods...
// // }











// Constructor


public class Car {
    String make;
    String model;
    int year;

    // Default constructor
    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    // Main method to test the class
    public static void main(String[] args) {
        Car car1 = new Car(); // Using default constructor
        System.out.println(car1.make);
        System.out.println(car1.model);


        

        Car car2 = new Car("HONDA","civic",2012); // Using parameterized constructor
        System.out.println(car2.model);

       
    }
}



