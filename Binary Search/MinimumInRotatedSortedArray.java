//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/1308275147/
class Solution {
    public int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int low = 0,high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}