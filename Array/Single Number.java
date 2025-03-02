https://leetcode.com/problems/single-number/
class Solution {
    int ans = 0;
    public int singleNumber(int[] nums) {
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }
}