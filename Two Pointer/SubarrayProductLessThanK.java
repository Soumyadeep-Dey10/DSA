//https://leetcode.com/problems/subarray-product-less-than-k/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) return 0;

        int count = 0;
        long res = 1;
        int i = 0, j = 0;

        while (j < nums.length) {
            res *= nums[j];

            while (res >= k && i <= j) {  
                res /= nums[i];
                i++;
            }

            count += j - i + 1;  
            j++;
        }
        return count;
    }
}
