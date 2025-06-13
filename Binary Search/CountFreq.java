//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/number-of-occurrence2259
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        for(int val : arr){
            if(val == target) count++;
        }
        return count;
    }
}
