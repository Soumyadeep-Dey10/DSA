//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays&sortBy=submissions
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int currentSum = 0;
        int start = 0;
        
        // ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int end = 0; end < n; end++) {
            // Add the current element to the currentSum
            currentSum += arr[end];
            
            
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            // Check if the currentSum equals the target
            if (currentSum == target) {
                // Return the 1-based indices (start + 1, end + 1)
                result.add(start + 1); 
                result.add(end + 1);    
                return result;
            }
        }
        
        // If no such subarray exists, return [-1]
        result.add(-1);
        return result;
    }
    
    
}