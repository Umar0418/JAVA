import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        // Create the 1st list with even numbers
        List<Integer> evenList = new ArrayList<>();
        for (int i = 2; i <= 10; i += 2) {
            evenList.add(i);
        }

        // Create the 2nd list with odd numbers
        List<Integer> oddList = new ArrayList<>();
        for (int i = 1; i <= 9; i += 2) {
            oddList.add(i);
        }

        System.out.println("1st List (Even Numbers): " + evenList);
        System.out.println("2nd List (Odd Numbers): " + oddList);

        // Remove an element at a specific position from the first list using list as a stack
        int positionToRemove = 2; // Remove the element at index 2 (3rd element)
        int removedElement = evenList.remove(positionToRemove);
        System.out.println("Removed element at position " + positionToRemove + ": " + removedElement);
        System.out.println("1st List after removal: " + evenList);
    }
}
