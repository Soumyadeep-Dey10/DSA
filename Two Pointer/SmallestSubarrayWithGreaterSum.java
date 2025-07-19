//https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
class Solution {

    public static int smallestSubWithSum(int k, int[] arr) {
        // Your code goes here
        int sum = 0, max = Integer.MAX_VALUE;
        int i = 0, j = 0;
        
        while(j < arr.length){
            sum += arr[j];
            
            if(arr[j] > k) return 1;
            
            
            
            while(sum > k){
                max = Math.min(j-i+1, max); 
                
                sum -= arr[i];
                
                i++;
            }
            
            j++;
        }
        return (max == Integer.MAX_VALUE) ? 0 : max;
    }
}