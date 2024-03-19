import java.util.*;

// Enum representing sports
enum Sports {
    FOOTBALL, BASKETBALL, CRICKET, TENNIS, HANDBALL
}

public class EnumMapOperations {
    public static void main(String[] args) {
        // Task a: Create an enum map named "BAT" and check if key "Handball" is present,
        // if not, clear the enum map
        EnumMap<Sports, String> BAT = new EnumMap<>(Sports.class);
        BAT.put(Sports.FOOTBALL, "Messi");
        BAT.put(Sports.BASKETBALL, "LeBron");
        BAT.put(Sports.CRICKET, "Kohli");

        if (!BAT.containsKey(Sports.HANDBALL)) {
            BAT.clear();
        }
        System.out.println("EnumMap BAT after checking and possibly clearing: " + BAT);

        // Task b: Clone the above created enum map and display both maps
        EnumMap<Sports, String> clonedMap = BAT.clone();
        System.out.println("Original EnumMap BAT: " + BAT);
        System.out.println("Cloned EnumMap: " + clonedMap);

        // Task c: Check if the map contains a mapping for a specified key,
        // if yes, return true; if no, replace the value with enum map "TRIO" values
        Sports keyToCheck = Sports.FOOTBALL;
        if (BAT.containsKey(keyToCheck)) {
            System.out.println("Map contains mapping for key " + keyToCheck + ": true");
        } else {
            System.out.println("Map does not contain mapping for key " + keyToCheck);
            EnumMap<Sports, String> TRIO = new EnumMap<>(Sports.class);
            TRIO.put(Sports.FOOTBALL, "Ronaldo");
            TRIO.put(Sports.BASKETBALL, "Jordan");
            TRIO.put(Sports.CRICKET, "Tendulkar");
            BAT.putAll(TRIO);
            System.out.println("EnumMap BAT after replacing values with TRIO: " + BAT);
        }

        // Task d: Check if entered values are prime numbers and count number of prime key-value pairs
        EnumMap<Sports, Integer> numbers = new EnumMap<>(Sports.class);
        numbers.put(Sports.FOOTBALL, 2);
        numbers.put(Sports.BASKETBALL, 3);
        numbers.put(Sports.CRICKET, 4);
        numbers.put(Sports.TENNIS, 5);
        numbers.put(Sports.HANDBALL, 6);

        int primeCount = countPrimePairs(numbers);
        System.out.println("Number of prime key-value pairs: " + primeCount);
    }

    // Utility method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Utility method to count the number of prime key-value pairs
    private static int countPrimePairs(EnumMap<Sports, Integer> map) {
        int count = 0;
        for (Map.Entry<Sports, Integer> entry : map.entrySet()) {
            if (isPrime(entry.getValue())) {
                count++;
            }
        }
        return count;
    }
}
