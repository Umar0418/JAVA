import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        // Task a: Create two hash maps and remove keys starting with "B"
        Map<String, Integer> super1 = new HashMap<>();
        super1.put("Apple", 10);
        super1.put("Banana", 20);
        super1.put("Carrot", 30);
        super1.put("Mango", 40);

        Map<String, Integer> super2 = new HashMap<>();
        super2.put("Ball", 50);
        super2.put("Bat", 60);
        super2.put("Cap", 70);
        super2.put("Dog", 80);

        removeKeysStartingWithB(super1);
        removeKeysStartingWithB(super2);

        System.out.println("Super1 after removing keys starting with 'B': " + super1);
        System.out.println("Super2 after removing keys starting with 'B': " + super2);

        // Task b: Create a hash map and display key values when value is product with 10
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 10);
        map.put("C", 15);
        map.put("D", 20);
        map.put("E", 25);

        displayKeyValuesProductWithTen(map);

        // Task c: Iterate over the entries created using methods in hash map
        System.out.println("Entries in the map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Task d: Compute a value for key named “C” if not associated with a value
        String key = "C";
        int value = 100; // Some default value
        map.merge(key, value, (existingValue, newValue) -> existingValue); // If key "C" already exists, keep its current value
        System.out.println("Map after merging 'C' with default value: " + map);
    }

    // Utility method to remove keys starting with "B"
    private static void removeKeysStartingWithB(Map<String, Integer> map) {
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (key.startsWith("B")) {
                iterator.remove();
            }
        }
    }

    // Utility method to display key values when value is product with 10
    private static void displayKeyValuesProductWithTen(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 10 == 0) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}
