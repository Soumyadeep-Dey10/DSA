//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] arr) {
         int left = 0, right = arr.length - 1;
        int res = 0;
        while (left < right) {
            
            // Find the water stored in the container between 
            // arr[left] and arr[right]
            int water = Math.min(arr[left], arr[right]) * (right - left);
            res = Math.max(res, water);
            
            if (arr[left] < arr[right])
                left += 1;
            else
                right -= 1;
        }
        
        return res;
    }
}