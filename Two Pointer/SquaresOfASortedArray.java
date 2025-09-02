//https://leetcode.com/problems/squares-of-a-sorted-array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, k = 0, j = nums.length - 1;
        int[] res = new int[nums.length];
        int n = res.length;
        int pos = nums.length - 1;
        while(i <= j){
            int left = nums[i], right = nums[j];
            if(left * left < right * right){
                res[n - k - 1] = right * right;
                j--;
            }
            else if(left * left > right * right){
                res[n - k - 1] = left * left;
                i++;
            }
            else{
                res[n - k - 1] = left * left;
                i++;
            }
            k++;
        }
        return res;
    }
}