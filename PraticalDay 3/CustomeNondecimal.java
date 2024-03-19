

// Main class demonstrating the custom exception
public class CustomeNondecimal {
    public static void main(String[] args) {
        try {
            String userInput = "3.14"; // User input (assume it's a string representation of a number)
            int number = Integer.parseInt(userInput);

            // Check if the number is an integer
            if (number != Double.parseDouble(userInput)) {
                throw new NonIntegerValueException("Non-integer value entered. Please enter an integer.");
            }

            System.out.println("Entered number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (NonIntegerValueException e) {
            System.out.println("Caught NonIntegerValueException: " + e.getMessage());
        }
    }
}
