import java.util.*;

public class TreeSetOperations {
    public static void main(String[] args) {
        // a) Create two sets arr1 and arr2 of size 7 and find the difference between two sets
        Set<Integer> arr1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Set<Integer> arr2 = new TreeSet<>(Arrays.asList(4, 5, 6, 7, 8, 9, 10));

        System.out.println("Set arr1: " + arr1);
        System.out.println("Set arr2: " + arr2);

        Set<Integer> difference = new TreeSet<>(arr1);
        difference.removeAll(arr2);
        System.out.println("Difference between arr1 and arr2: " + difference);

        // b) Create a tree set and find the smallest element which is greater than a threshold
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        int threshold = 25;

        Integer smallestGreaterThanThreshold = treeSet.higher(threshold);
        System.out.println("Smallest element greater than " + threshold + ": " + smallestGreaterThanThreshold);

        // c) Retrieve and remove the first and last elements in a treeset using functions
        Integer firstElement = treeSet.pollFirst();
        Integer lastElement = treeSet.pollLast();
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + lastElement);
        System.out.println("TreeSet after removal: " + treeSet);

        // d) Find the floor and ceil value of a specific element in a tree set
        int specificElement = 35;

        Integer floorValue = treeSet.floor(specificElement);
        Integer ceilValue = treeSet.ceiling(specificElement);

        System.out.println("Floor value of " + specificElement + ": " + floorValue);
        System.out.println("Ceil value of " + specificElement + ": " + ceilValue);
    }
}

