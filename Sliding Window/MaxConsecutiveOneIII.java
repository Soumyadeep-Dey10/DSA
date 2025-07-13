//https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, maxLen = 0, countZero = 0;
        while(j < nums.length){
            if(nums[j] == 0) countZero += 1;

            if(countZero > k){
            if(nums[i] == 0){
                countZero--;
            }
            i++;
            }

            if(countZero <= k){
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        return maxLen;
    }
}