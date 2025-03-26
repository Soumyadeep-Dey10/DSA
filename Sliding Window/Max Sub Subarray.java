//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
class Solution {
    public int maximumSumSubarray(int[] nums, int k) {
        // Code here
        int i = 0, j = 0;
        int sum = 0, maxSum = Integer.MIN_VALUE; 
        
        while(j < nums.length){
            sum += nums[j];  
            
            if(j - i + 1 == k) { 
                maxSum = Math.max(sum, maxSum);  
                sum -= nums[i];  
                i++;  
            }
            
            j++; 
        }
        
        return maxSum; 
    }
}