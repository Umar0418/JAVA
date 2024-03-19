import java.util.*;

public class Setoperations {
    public static void main(String[] args) {
        // Create set1 and set2
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // a) Intersection and union operations
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Intersection
        System.out.println("Intersection of set1 and set2: " + intersection);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // Union
        System.out.println("Union of set1 and set2: " + union);

        // b) Subset containing elements greater than a specified value
        int specifiedValue = 3;
        Set<Integer> subset = new HashSet<>();
        for (int num : set1) {
            if (num > specifiedValue) {
                subset.add(num);
            }
        }
        System.out.println("Subset containing elements greater than " + specifiedValue + ": " + subset);

        // c) Convert sets to array format and print elements
        Integer[] set1Array = set1.toArray(new Integer[0]);
        System.out.println("Elements of set1 array: " + Arrays.toString(set1Array));

        Integer[] set2Array = set2.toArray(new Integer[0]);
        System.out.println("Elements of set2 array: " + Arrays.toString(set2Array));

        // d) Retain only elements present in both sets
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        System.out.println("Common elements in set1 and set2: " + commonElements);
    }
}

