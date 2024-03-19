
    import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

    public class NumberFormate {
        public static void main(String[] args) {
            try {
                String nonNumericString = "Hello";
                int number = Integer.parseInt(nonNumericString);
                System.out.println("Number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            try {
                int userInput = Integer.parseInt(scanner.nextLine());
                System.out.println("User Input: " + userInput);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
                String formattedNumber = decimalFormat.format("12345.67");
                System.out.println("Formatted Number: " + formattedNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            try {
                String numberString = "1,234.56";
                NumberFormat numberFormat = NumberFormat.getInstance();
                double number = numberFormat.parse(numberString).doubleValue();
                System.out.println("Number: " + number);
            } catch (ParseException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


