// Step 1: Define the Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Throw the Exception
public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught an InvalidAgeException: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}
