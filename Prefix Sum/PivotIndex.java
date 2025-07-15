class Solution {
    public int pivotIndex(int[] arr) {
        int totalsum = 0;
        for(int val : arr) totalsum += val;
        
        int leftsum = 0;
        for(int i = 0; i < arr.length; i++){
            int rightsum = totalsum - arr[i] - leftsum;
            
            if(rightsum == leftsum) return i;
            
            leftsum += arr[i];
        }
        return -1;
    }
}