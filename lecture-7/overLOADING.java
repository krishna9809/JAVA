
// // // inheritance

// class Employee { //Superclass
//   float salary = 40000;
// }

// class Programmer extends Employee { // Subclass
//   int bonus = 10000;

// }

// public class OOPS {
//   public static void main(String args[]) {

//     Programmer p = new Programmer(); // object creation

//     System.out.println("Programmer salary is:" + p.salary);
//     System.out.println("Bonus of Programmer is:" + p.bonus);
//   }
// }












// 1) Method Overloading: changing no. of arguments

// class Adder {

//   int add(int a, int b) {
//     return a + b;
//   }

//   int add(int a, int b, int c) {
//     return a + b + c;
//   }
// }

// public class TestOverloading1 {
//   public static void main(String[] args) {
//   Adder A1 = new Adder();

//     System.out.println(A1.add(11, 22));

//     System.out.println(A1.add(11, 11, 11));
    
//   }
// }

// 2) Method Overloading: changing data type of arguments

// class Adder {
//   static int add(int a, int b) {
//     return a + b;
//   }

//   static double add(double a, double b) {
//     return a + b;
//   }
// }

// public class TestOverloading2 {
//   public static void main(String[] args) {

//     System.out.println(Adder.add(11, 11));

//     System.out.println(Adder.add(12.3, 12.6));
//   }
// }














// Overriding

//Creating a parent class.  

class Vehicle {
  // defining a method
  void run() {
    System.out.println("Vehicle is running");
  }
}
// Creating a child class

class Bike2 extends Vehicle {
  // defining the same method as in the parent class
  void run() {
    System.out.println("Bike is running safely");
  }
}

public class overLOADING{
public static void main(String args[]) {

  Bike2 obj = new Bike2();// creating object
  
  obj.run();// calling method
}
}