class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int result_sum = 0;
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while(left < right){
                int total = nums[i] + nums[left] + nums[right];
                int d = Math.abs(target - total);

                if(d < diff){
                    diff = d;
                    result_sum = total;
                }

                if(total == target) return result_sum;
                else if(total < target) left++;
                else right--;
            }
        }
        return result_sum;
    }
}