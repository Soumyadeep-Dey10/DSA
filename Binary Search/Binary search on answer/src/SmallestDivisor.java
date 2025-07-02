//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
class Solution {
    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            max = Math.max(val, max);
        }
        return max;
    }

    public int count(int[]arr, int mid){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans += Math.ceil( (double)arr[i]/ (double)mid);
        }
        return ans;
    }
    public int smallestDivisor(int[] arr, int threshold) {
        int low = 1, high = findMax(arr);
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            int totalHour = count(arr, mid);
            if(totalHour <= threshold){
                ans = mid;
                high = mid - 1; //continue search for less value
            }else{
                low = mid + 1;
            }
        }
        return ans;       
    }
}