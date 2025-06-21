//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/peak-element
class Solution {

    public int peakElement(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        if(arr[0] >= arr[1]) return 0;
        
        if(arr[n-1] >= arr[n-2]) return n-1;
        // code here
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) return i;
        }
        return -1;
    }
}