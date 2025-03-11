//check arrays is subset of another array
import java.util.HashSet;

public class SubsetCheck {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1 (main array) to HashSet
        for (int num : arr1) {
            set.add(num);
        }

        // Check if all elements of arr2 (subset candidate) exist in set
        for (int num : arr2) {
            if (!set.contains(num)) {
                return false; // If any element is missing, arr2 is not a subset
            }
        }

        return true; // All elements were found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {2, 4, 6};  // Should return true
        int[] arr3 = {2, 8};     // Should return false

        System.out.println("arr2 is subset of arr1: " + isSubset(arr1, arr2));
        System.out.println("arr3 is subset of arr1: " + isSubset(arr1, arr3));
    }
}
