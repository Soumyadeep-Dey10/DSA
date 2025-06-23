//https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/0
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int res = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == x){
                res = mid;
                high = mid - 1;
            }
            else if(arr[mid] > x){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}