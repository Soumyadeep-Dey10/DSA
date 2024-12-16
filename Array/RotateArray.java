//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621
package Array;

public class RotateArray {
    static void rotateArr(int nums[], int k) {
        k = k % nums.length; // Normalize k
        swap(nums, 0, k - 1); // Reverse the first k elements
        swap(nums, k, nums.length - 1); // Reverse the remaining elements
        swap(nums, 0, nums.length - 1); // Reverse the whole array
    }

    static void swap(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
