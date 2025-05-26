//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int sum = 1;
        int maxProduct = Integer.MIN_VALUE;
        //forward traversal
        for(int val : arr){
            sum  *= val;
            maxProduct = Math.max(maxProduct, sum);
            if(sum == 0) sum = 1;
        }
        sum = 1;
        //backward traversal
        for(int i = arr.length-1; i >=0 ; i--){
            sum *= arr[i];
            maxProduct = Math.max(sum, maxProduct);
            if(sum == 0) sum = 1; 
        }
        return maxProduct;
    }
}