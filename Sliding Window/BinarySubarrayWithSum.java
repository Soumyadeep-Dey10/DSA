//https://leetcode.com/problems/binary-subarrays-with-sum/
class Solution {

    //find subarray sum <= goal
    public int fun1(int[] nums, int goal){
        int l = 0, r= 0;
        int sum = 0, count = 0;
        while(r < nums.length){
            sum += nums[r];

            while(sum > goal){
                sum -= nums[l];
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
            sum += nums[r];

            while(l <= r && sum > goal){
                sum -= nums[l];
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return fun1(nums, goal) - fun2(nums, goal);
    }
}