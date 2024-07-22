// Defualt Method

@FunctionalInterface
interface Vehicle {
        // Abstract method (no implementation)
        void startEngine();
    
        // Default method (has a default implementation)
        default void honk() {
            System.out.println("Honking the horn!");
        }
}

    public class Car implements Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Starting car engine...");
        }
    
        public static void main(String[] args) {
            Car car = new Car();
            car.startEngine(); // Outputs: Starting car engine...
            car.honk(); // Outputs: Honking the horn!
        }
    }
    
