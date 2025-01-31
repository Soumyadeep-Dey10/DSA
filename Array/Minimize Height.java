import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0; // Only one tower, no difference
        
        Arrays.sort(arr); // Sort the array
        
        int minDiff = arr[n - 1] - arr[0]; // Initial max difference
        
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue; // Skip if decreasing makes height negative
            
            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            
            minDiff = Math.min(minDiff, maxHeight - minHeight);
        }
        
        return minDiff;
    }
}

