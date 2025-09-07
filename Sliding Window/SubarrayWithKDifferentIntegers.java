//https://leetcode.com/problems/subarrays-with-k-different-integers/
class Solution {
    // count subarrays with at most k distinct numbers
    private int atMostK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, count = 0;

        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (map.size() > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }

            // all subarrays ending at j with valid window
            count += j - i + 1;
            j++;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
}
