public class ArrayIndex {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[3];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int[] arr = {1, 2, 3};
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int[][] nestedArr = {{1, 2}, {3, 4}};
            int value = nestedArr[1][2];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            printArray(arr2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

