class Solution {
    public int maxSubarraySum(int[] arr, int k) {
       int sum = 0, ans = Integer.MIN_VALUE;
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // add element to window

            if (j - i + 1 == k) { 
                ans = Math.max(ans, sum);
                sum -= arr[i];
                i++;
            }
        }
        return ans;
    }
}