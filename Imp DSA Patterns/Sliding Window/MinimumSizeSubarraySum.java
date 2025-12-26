//https://leetcode.com/problems/minimum-size-subarray-sum/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(high < nums.length){
            sum += nums[high];
            while(sum >= target){
                ans = Math.min(high-low+1, ans);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return (ans == Integer.MAX_VALUE)? 0 : ans;
    }
}