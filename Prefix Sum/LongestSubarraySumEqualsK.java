// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            
            if(prefixSum == k) res = i + 1;
            else if(map.containsKey(prefixSum - k))
                res = Math.max(res, i - map.get(prefixSum - k));
            
            if(!map.containsKey(prefixSum))
                map.put(prefixSum, i);
        }
        return res;
    }
}
