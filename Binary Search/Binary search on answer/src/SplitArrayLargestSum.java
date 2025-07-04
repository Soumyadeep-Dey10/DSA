//https://leetcode.com/problems/split-array-largest-sum/
class Solution {
    public static boolean isValid(int[] arr, int m, int maxAllowedPages){
        int n = arr.length;
        if(n < m) return false;  // If books are fewer than students, impossible
        
        int sum = 0, student = 1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > maxAllowedPages){
                return false;
            }
            if(sum + arr[i] <= maxAllowedPages){
                sum += arr[i];
            } else {
                sum = arr[i];
                student++;
            }
        }
        return student <= m;
    }
    
    public int splitArray(int[] arr, int m) {
        int sum = 0, max = Integer.MIN_VALUE;
        
        for(int val : arr){
            max = Math.max(val, max);  
            sum += val;
        }
        
        int low = max, high = sum;
        int ans = -1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(isValid(arr, m, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}