// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

class Solution {
    public int longestSubarray(int[] arr, int k) {
     
        int  sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            
            //if sum > k
            int rem = sum - k;
            
            //if sum - k is present in the map then update the maxLen 
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(len, maxLen);
            }
            
            //we need to fill the map to the left most position for each value
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
