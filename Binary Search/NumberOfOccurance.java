//count no of occurance of an element in sorted array
class Solution {
    public int[] searchRange(int[] arr, int x) {
        int[] ans = new int[2];
        ans[0] =  binarySearch(arr,x,true);
        ans[1] = binarySearch(arr,x, false);
        return ans;      
    }
    public static int binarySearch(int[] arr,int x,boolean firstOccurance){
            int res = -1;
            int low = 0, high = arr.length-1;
            while(low <= high){
                int mid = high + (low-high)/2;
                if(arr[mid] > x) high = mid-1;
                else if(arr[mid] < x) low = mid+1;
                else{
                    res = mid;
                    if(firstOccurance){
                        high = mid-1;
                    }
                    else{
                        low = mid+1;
                    }
                }
            }
            return res;
        }
}