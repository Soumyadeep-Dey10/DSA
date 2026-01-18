//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
class Solution {

    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                res = mid; // Possible floor candidate
                low = mid + 1; // Keep going right to find the last one
            } else {
                high = mid - 1;
            }
        }

        return res;
    }
}
