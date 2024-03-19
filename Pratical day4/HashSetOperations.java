import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {
        // a) Check whether two hash sets contain the same elements
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("HashSet 1: " + set1);
        System.out.println("HashSet 2: " + set2);

        if (set1.equals(set2)) {
            System.out.println("HashSet 1 and HashSet 2 contain the same elements.");
        } else {
            System.out.println("HashSet 1 and HashSet 2 do not contain the same elements.");
        }

        // b) Convert ArrayList to HashSet and display it
        List<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "banana"));
        Set<String> hashSet = new HashSet<>(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashSet from ArrayList: " + hashSet);

        // c) Check if a specific element is present in the set, if not, append it
        String specificElement = "grapes";
        if (!hashSet.contains(specificElement)) {
            hashSet.add(specificElement);
        }
        System.out.println("HashSet after appending element: " + hashSet);

        // d) Create a clone of the original set and return both hash sets
        Set<String> clonedSet = new HashSet<>(hashSet);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Returning both hash sets
        System.out.println("Original HashSet: " + hashSet);
        System.out.println("Cloned HashSet: " + clonedSet);
    }
}
