class Solution {

    // Normal Kadane (Maximum Subarray)
    public int maxSubarray(int[] nums){
        int bestEnding = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1, v2);
            ans = Math.max(ans, bestEnding);
        }
        return ans;
    }

    // Minimum Subarray (reverse Kadane)
    public int smallestSumSubarray(int[] nums) {
        int bestEnding = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.min(v1, v2);
            ans = Math.min(ans, bestEnding);
        }
        return ans;
    }

    // Circular Maximum Subarray
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }

        int maxNormal = maxSubarray(nums);

        // If all elements are negative, circular sum becomes 0 (invalid)
        if(maxNormal < 0){
            return maxNormal;
        }

        int minSubarray = smallestSumSubarray(nums);

        return Math.max(maxNormal, totalSum - minSubarray);
    }
}