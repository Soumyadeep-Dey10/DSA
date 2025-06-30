//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-row-wise-sorted-matrix
class Solution {
    // Function to search a given number in row-column sorted matrix.
    
    public static boolean binarySearch(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) low = mid+1;
            else high = mid - 1;
        }
        return false;
    }
    public boolean searchRowMatrix(int[][] matrix, int x) {
        // code here
        boolean ans = false;
        int n = matrix.length, m = matrix[0].length;
        for(int i = 0; i < n; i++){
            ans = binarySearch(matrix[i], x);
            if(ans == true) return ans;
        }
        return ans;
    }
}