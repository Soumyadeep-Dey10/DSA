//https://leetcode.com/problems/count-number-of-nice-subarrays/
class Solution {
    //find subarray sum <= goal
    public int fun1(int[] nums, int goal){
        int l = 0, r= 0;
        int sum = 0, count = 0;
        while(r < nums.length){
            sum += nums[r] % 2;

            while(sum > goal){
                sum -= nums[l] % 2;
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }

    //find subarray sum <= goal-1
    public int fun2(int[] nums, int goal){
        if(goal < 0) return 0;
        goal = goal - 1;
        int l = 0, r= 0;
        int sum = 0, count = 0;
        while(r < nums.length){
            sum += nums[r] % 2;

            while(l <= r && sum > goal){
                sum -= nums[l] % 2;
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int goal) {
        return fun1(nums, goal) - fun2(nums, goal);
    }
}