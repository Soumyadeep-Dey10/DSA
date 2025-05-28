//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/smallest-positive-missing-number-1587115621
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] <= 0 || arr[i] > n){
                arr[i] = n+1;
            }
        }
        
        for(int i = 0; i < n; i++){
            int num = Math.abs(arr[i]);
            if(num <= n){
                arr[num-1] = -Math.abs(arr[num-1]);
            }
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}
