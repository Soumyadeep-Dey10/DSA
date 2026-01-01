class Solution {
    static int smallestSumSubarray(int nums[], int size) {
        // your code here
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
}