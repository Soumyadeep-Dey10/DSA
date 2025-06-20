//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int first = binarySearch(arr, target, true); 
        if(first == -1) return 0;
        int last = binarySearch(arr, target, false);    
        return last - first + 1;
    }
    
    private static int binarySearch(int[] arr, int target, boolean isFirstOccurance){
        int low = 0, high = arr.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] < target) low = mid+1;
            else if(arr[mid] > target) high = mid-1;
            else{
                res = mid;
                if(isFirstOccurance) high = mid - 1;
                else low = mid+1;
            }
        } 
        return res;
    }
}
