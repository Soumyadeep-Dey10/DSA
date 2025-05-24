//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351
class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        // code here
        if(n == 1) return 0;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        
        for(int i= 0; i < n-1; i++){
            int min = Math.min(smallest, arr[i+1] - k);
            int max = Math.max(largest, arr[i] +k);
            
            if(min < 0) continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}
