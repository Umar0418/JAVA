public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        try {
            // Scenario a) Negative Argument in the method requiring non-negative values
            int value = -5;
            if (value < 0) {
                throw new IllegalArgumentException("Negative value passed, positive value expected.");
            }
            System.out.println("Value is: " + value);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Scenario b) Invalid Enum Constant Passed to a Method
            String day = "Funday"; // Assume this is an invalid enum constant
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
            System.out.println("Day of the week is: " + dayOfWeek);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Scenario c) Setting an Invalid Range for a Method Parameter
            int age = 150; // Assume this is an invalid age
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Invalid age range, age must be between 0 and 120.");
            }
            System.out.println("Age is: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        try {
            // Scenario d) Empty or Null String Argument in a Method Requiring Non-Empty and Non-Null String
            String name = null; // Assume this is an empty or null string
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Empty or null string passed, non-empty and non-null string expected.");
            }
            System.out.println("Name is: " + name);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
