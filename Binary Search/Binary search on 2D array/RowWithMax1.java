//https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
class Solution {

	//Linear serach
     public int[] rowAndMaximumOnes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int index = 0, maxCount = 0;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        
        return new int[]{index, maxCount};
    }



    //optimal approach using binary searh
    public static int firstOccurrence(int[] arr, int x) {
        int res = -1;
        int low = 0, high = arr.length - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
        
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;  
        }
    }
    
    return res;
}
    public int rowWithMax1s(int matrix[][]) {
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        
        int index = 0, maxCount = -1;
        for(int i = 0; i < matrix.length; i++){
            int firstIndex = firstOccurrence(matrix[i], 1);
            int count = (firstIndex == -1) ? 0 : (m - firstIndex);
            if(count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        return index;
    }
}