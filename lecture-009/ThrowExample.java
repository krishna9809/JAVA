
    public class ThrowExample {
        public static void main(String[] args) {
            try {
                validateAge(19); // This will throw an exception
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    
        public static void validateAge(int age) {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older.");
            }
            System.out.println("Age is valid.");
        }
    }

