//https://www.geeksforgeeks.org/problems/pair-sum-in-a-sorted-and-rotated-array/1
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        
        //Find the pivot (index of the largest element)
        int pivot = -1;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot, the array is not rotated
        if(pivot == -1) pivot = n - 1;

        int l = (pivot + 1) % n; // index of smallest element
        int r = pivot;           // index of largest element

        // Two pointer search with wrap-around
        while(l != r) {
            int sum = arr[l] + arr[r];

            if(sum == target) return true;
            else if(sum < target)
                l = (l + 1) % n;
            else
                r = (r - 1 + n) % n;
        }

        return false;
    }
}
