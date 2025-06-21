//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
      int low = 0, high = nums.length - 1;
      int n = nums.length;
      while(low <= high){

        // If subarray is already sorted
        if (nums[low] <= nums[high]) return nums[low];
        
        int mid = (low+high) / 2;

        int right = (mid+1) % n, left = (mid + n -1) % n;

        if(nums[mid] <= nums[left] && nums[mid] <= nums[right]) return nums[mid];

        else if(nums[low] <= nums[mid]){
            low = mid+1;
        } 
        else{
            high = mid-1;
        } 
      }
      return -1;
    }
}
