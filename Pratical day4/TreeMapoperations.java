import java.util.*;

public class TreeMapoperations {
    public static void main(String[] args) {
        // Task a: Create a tree map and remove & retrieve first and n-1 entries
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Carrot", 30);
        treeMap.put("Dog", 40);
        treeMap.put("Elephant", 50);

        System.out.println("Original TreeMap: " + treeMap);

        // Remove and retrieve first entry
        Map.Entry<String, Integer> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Removed first entry: " + firstEntry);

        // Remove and retrieve n-1 entries
        int n = treeMap.size() - 1;
        List<Map.Entry<String, Integer>> removedEntries = removeNMinusOneEntries(treeMap, n);
        System.out.println("Removed " + n + " entries: " + removedEntries);

        // Task b: Build an empty tree map sorted by natural order of keys
        TreeMap<String, Integer> emptyTreeMap = new TreeMap<>();
        System.out.println("Empty TreeMap sorted by natural order of keys: " + emptyTreeMap);

        // Task c: Derive a sub map from original tree map starting from key "A" and ending with "D"
        SortedMap<String, Integer> subMap = treeMap.subMap("A", "D");
        System.out.println("Sub map from key 'A' to key 'D': " + subMap);

        // Task d: Return a portion of the map whose keys are strictly less than a specified key
        // and a view of the portion of the map whose keys are greater than or equal to a specified key
        SortedMap<String, Integer> headMap = treeMap.headMap("C");
        SortedMap<String, Integer> tailMap = treeMap.tailMap("C");
        System.out.println("Portion of the map whose keys are less than 'C': " + headMap);
        System.out.println("Portion of the map whose keys are greater than or equal to 'C': " + tailMap);
    }

    // Utility method to remove n-1 entries from the tree map
    private static List<Map.Entry<String, Integer>> removeNMinusOneEntries(TreeMap<String, Integer> map, int n) {
        List<Map.Entry<String, Integer>> removedEntries = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        for (int i = 0; i < n && iterator.hasNext(); i++) {
            Map.Entry<String, Integer> entry = iterator.next();
            removedEntries.add(entry);
            iterator.remove();
        }
        return removedEntries;
    }
}
