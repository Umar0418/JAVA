import java.util.*;

public class ArrayListIndexDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Store input in specific indices
        storeInputAtIndex(arrayList, 0, 10);
        storeInputAtIndex(arrayList, 2, 20);
        storeInputAtIndex(arrayList, 4, 30);

        System.out.println("ArrayList after storing input at specific indices: " + arrayList);

        // Remove an element using index value
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            int removedElement = arrayList.remove(indexToRemove);
            System.out.println("Removed element at index " + indexToRemove + ": " + removedElement);
            System.out.println("ArrayList after removal: " + arrayList);
        } else {
            System.out.println("Invalid index. Element cannot be removed.");
        }
    }

    // Method to store input at a specific index in an ArrayList
    private static void storeInputAtIndex(List<Integer> list, int index, int value) {
        if (index >= 0 && index <= list.size()) {
            list.add(index, value);
        } else {
            System.out.println("Invalid index. Element cannot be added at index " + index);
        }
    }
}
