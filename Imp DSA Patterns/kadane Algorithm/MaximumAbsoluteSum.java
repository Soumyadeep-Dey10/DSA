class Solution {
    public int maxSubArray(int[] nums) {
        int bestending = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];

            bestending = Math.max(v1, v2);

            ans = Math.max(bestending, ans);
        }
        return ans;
    }
    public int smallestSumSubarray(int nums[]) {
        
        int bestending = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];

            bestending = Math.min(v1, v2);

            ans = Math.min(bestending, ans);
        }
        return ans;
    }

    public int maxAbsoluteSum(int[] nums) {
        return Math.max(maxSubArray(nums),Math.abs(smallestSumSubarray(nums)));
    }

}