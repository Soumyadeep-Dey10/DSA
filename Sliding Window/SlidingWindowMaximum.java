//https://leetcode.com/problems/sliding-window-maximum/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        int i = 0, j = 0;
        while(j< nums.length){
         if(j == 0) dq.add(nums[j]);
         else{
            while(dq.size() > 0 && nums[j] > dq.peekLast()){
                dq.removeLast();
            }
            dq.add(nums[j]);
         }
         if(j - i + 1 < k) j++;
         else if(j - i + 1 == k){
            ans[i] = dq.peek();
            if(nums[i] == dq.peek()){
                dq.removeFirst();
            }
            i++;
            j++;
         }
        }
        return ans;
    }
}