class Solution {

    public int peakElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;  // Return -1 to indicate no peak element
        }
        if(arr.length == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[arr.length-1] > arr[arr.length -2]) return arr.length - 1;
        
        for(int i = 1; i < arr.length-1; i++){
            
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
}