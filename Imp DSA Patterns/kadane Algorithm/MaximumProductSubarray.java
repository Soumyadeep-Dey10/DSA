class Solution {
    public int maxProduct(int[] nums) {
        int bestmaxending = nums[0];
        int bestminending = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
           int v1 = nums[i];
           int v2 = nums[i] * bestmaxending;
           int v3 = nums[i] * bestminending;
           bestmaxending = Math.max(v1,Math.max(v2, v3));
           bestminending = Math.min(v1,Math.min(v2, v3)); 

           ans = Math.max(ans, Math.max(bestmaxending, bestminending));
        }
        return ans;
    }
}