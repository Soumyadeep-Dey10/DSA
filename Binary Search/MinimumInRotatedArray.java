//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/minimum-element-in-a-sorted-and-rotated-array3611
class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int min = 0, rotate = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[(i+ 1) % arr.length]){
                return arr[(i+1) % arr.length];
            }
        }
        return arr[0];
    }
}
