import java.util.*;

public class SortedMapOperations {
    public static void main(String[] args) {
        // Task a: Create a sorted map and return n-2 keys present in it
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");
        sortedMap.put(3, "Three");
        sortedMap.put(4, "Four");
        sortedMap.put(5, "Five");

        int n = 2;
        SortedMap<Integer, String> nMinusTwoKeys = getNMinusTwoKeys(sortedMap, n);
        System.out.println("n-2 keys present in the sorted map: " + nMinusTwoKeys);
        System.out.println("Size of sorted map after operation: " + sortedMap.size());

        // Task b: Create a sub map with inclusive and exclusive bounds
        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 4); // Inclusive lower bound, exclusive upper bound
        System.out.println("Sub map with keys between 2 (inclusive) and 4 (exclusive): " + subMap);

        // Task c: Remove and return first and last entries in sorted map
        Map.Entry<Integer, String> firstEntry = sortedMap.firstEntry();
        Map.Entry<Integer, String> lastEntry = sortedMap.lastEntry();
        System.out.println("Removed first entry: " + sortedMap.pollFirstEntry());
        System.out.println("Removed last entry: " + sortedMap.pollLastEntry());

        // Task d: Find Armstrong numbers using the sorted map
        System.out.println("Armstrong numbers:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            int number = entry.getKey();
            if (isArmstrongNumber(number)) {
                System.out.println(entry.getKey());
            }
        }
    }

    // Utility method to get n-2 keys from a sorted map
    private static SortedMap<Integer, String> getNMinusTwoKeys(SortedMap<Integer, String> sortedMap, int n) {
        SortedMap<Integer, String> result = new TreeMap<>();
        int count = 0;
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            if (count >= n - 2) {
                break;
            }
            result.put(entry.getKey(), entry.getValue());
            count++;
        }
        return result;
    }

    // Utility method to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        return result == number;
    }
}
