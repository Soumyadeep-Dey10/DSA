//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/two-pointer-technique-gfg-160/problem/count-pairs-whose-sum-is-less-than-target

class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        
        int i = 0, j = arr.length - 1;
        int count = 0;
        
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum < target) {
                count += j - i;
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}