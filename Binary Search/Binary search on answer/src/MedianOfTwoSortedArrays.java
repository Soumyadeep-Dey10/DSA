//https://leetcode.com/problems/median-of-two-sorted-arrays/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int count = 0;
        int element1 = 0, element2 = 0;
        int n = nums1.length + nums2.length;
        int index1 = n / 2;
        int index2 = index1 - 1;

        while (count <= index1) {
            int val;
            if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
                val = nums1[i];
                i++;
            } else {
                val = nums2[j];
                j++;
            }

            if (count == index2) element2 = val;
            if (count == index1) element1 = val;
            count++;
        }

        if (n % 2 == 0) {
            return (element1 + element2) / 2.0;
        } else {
            return element1;
        }
    }
}
