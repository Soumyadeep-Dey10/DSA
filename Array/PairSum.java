class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int count = 0, i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i] + arr[j] > target){
                j--;
            }
            else if(arr[i] + arr[j] < target){
                i++;
            } 
            else {
                count++;
                
            };
        }
        return count;
    }
}