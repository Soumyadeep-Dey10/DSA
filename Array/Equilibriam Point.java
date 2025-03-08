//https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&sortBy=submissions
class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
         int n = arr.length;
        
        if (n == 1) {
            return 0;
        }
        
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        
        // Iterate over the array to find the equilibrium point
        for (int i = 0; i < n; i++) {
            // Subtract the current element from the total sum to get the right sum
            totalSum -= arr[i];
            
            // Check if the left sum is equal to the right sum
            if (leftSum == totalSum) {
                return i; // Return the index of equilibrium point
            }
            
            // Update the left sum by adding the current element
            leftSum += arr[i];
        }
        
        // If no equilibrium point is found, return -1
        return -1;
    }
}