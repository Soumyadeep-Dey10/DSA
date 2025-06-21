//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1314272322/
class Solution {
    // public int search(int[] nums, int target) {
    //             int low = 0;
    //     int high = nums.length-1;
    //     while (low <= high){
    //         int mid = low +(high-low)/2;
    //         if(nums[mid] == target) return mid;
    //         if(nums[low] <= nums[mid]){
    //             if(target>= nums[low] && target<nums[mid]){
    //                 high = mid-1;
    //             }
    //             else{
    //                 low = mid+1;
    //             }
    //         }else{
    //             if(target> nums[mid] && target<=nums[high]){
    //                 low = mid+1;
    //             }
    //             else{
    //                 high = mid-1;
    //             }
    //         }
    //     }
    //     return -1;
    // }


   // 2nd approach
    class Solution {
    public int search(int[] nums, int target) {
        int index = findMinIndex(nums); 
        int ans1 = bSearch(nums, 0, index - 1, target);
        int ans2 = bSearch(nums, index, nums.length - 1, target);
        return Math.max(ans1, ans2);  
    }

    public static int bSearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public int findMinIndex(int[] nums) {
        int low = 0, high = nums.length - 1;
        int n = nums.length;

        while (low <= high) {
            // If subarray is already sorted
            if (nums[low] <= nums[high]) return low;

            int mid = (low + high) / 2;
            int right = (mid + 1) % n;
            int left = (mid + n - 1) % n;

            if (nums[mid] <= nums[left] && nums[mid] <= nums[right]) return mid;
            else if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;  // Should never reach here for valid input
    }
}

}
