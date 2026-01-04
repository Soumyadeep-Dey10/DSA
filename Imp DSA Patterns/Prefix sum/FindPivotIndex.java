class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0, right = 0, sum = 0;
        for(int val : nums){
            sum += val;
        }
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                left += nums[i-1];
            }
            
            right = sum - nums[i] - left;
            if(left == right) return i;
        }
        return -1;
    }
}