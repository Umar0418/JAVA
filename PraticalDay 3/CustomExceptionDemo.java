// Custom exception class for handling negative values
class NegativeValueException extends RuntimeException {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Main class demonstrating the custom exception
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int value = -5; // User input
            if (value < 0) {
                throw new NegativeValueException("Negative value entered. Please enter a non-negative value.");
            }
            System.out.println("Entered value is: " + value);
        } catch (NegativeValueException e) {
            System.out.println("Caught NegativeValueException: " + e.getMessage());
        }
    }
}

