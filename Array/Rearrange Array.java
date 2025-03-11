//Rearrange the array in increasing and decreasing order
import java.util.Arrays;

public class Main {
    public static void rearrange(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array
        
        int n = arr.length;
        int[] result = new int[n];
        
        int left = 0; // For the first half (increasing order)
        int right = n - 1; // For the second half (decreasing order)
        int index = 0;
        
        // First half (smallest half in increasing order)
        for (int i = 0; i < (n + 1) / 2; i++) {
            result[index++] = arr[i];
        }
        
        // Second half (largest half in decreasing order)
        for (int i = n - 1; i >= (n + 1) / 2; i--) {
            result[index++] = arr[i];
        }
        
        // Copy back to original array
        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3, 8, 4, 7};
        rearrange(arr);
        
        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}
