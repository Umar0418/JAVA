// Custom exception class for handling invalid decimal numbers
class InvalidDecimalNumberException extends Exception {
    public InvalidDecimalNumberException(String message) {
        super(message);
    }
}

// Main class demonstrating the custom exception
public class CustomDecimal {
    public static void main(String[] args) {
        try {
            String userInput = "abc"; // User input (assume it's a string representation of a decimal number)
            double number = Double.parseDouble(userInput);

            // Check if the number is valid (for example, if it's not NaN or infinity)
            if (Double.isNaN(number) || Double.isInfinite(number)) {
                throw new InvalidDecimalNumberException("Invalid decimal number entered. Please enter a valid decimal number.");
            }

            System.out.println("Entered number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (InvalidDecimalNumberException e) {
            System.out.println("Caught InvalidDecimalNumberException: " + e.getMessage());
        }
    }
}
