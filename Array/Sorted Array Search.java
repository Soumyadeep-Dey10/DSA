class Solution {
    static boolean searchInSorted(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
            
        }
        return false;
    }
}