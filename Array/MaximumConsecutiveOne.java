//https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0, ans = 0;
        for(int num : nums){
            if(num == 1) {
                count++;
                ans = Math.max(ans , count);
            }
            else if(num == 0) count = 0;
        }
        return ans;
    }
}