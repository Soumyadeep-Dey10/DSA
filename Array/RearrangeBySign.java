//https://leetcode.com/problems/rearrange-array-elements-by-sign/
class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] res = new int[nums.length];
       int pos = 0, neg = 1;
       for(int i = 0; i < nums.length; i++){
        if(nums[i] > 0){
            res[pos] = nums[i];
            pos += 2;
        }else if(nums[i] < 0){
            res[neg] = nums[i];
            neg += 2;
        }
    }
    return res;
    }
}