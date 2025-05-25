//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution {
    // public static int findUnion(int a[], int b[]) {
    //     int[] ans = new int[a.length + b.length];
    //     int i = 0, j = 0, k = 0;

    //     while (i < a.length && j < b.length) {
    //         if (a[i] < b[j]) {
    //             if (k == 0 || ans[k - 1] != a[i]) {
    //                 ans[k++] = a[i];
    //             }
    //             i++;
    //         } else if (a[i] > b[j]) {
    //             if (k == 0 || ans[k - 1] != b[j]) {
    //                 ans[k++] = b[j];
    //             }
    //             j++;
    //         } else { // equal
    //             if (k == 0 || ans[k - 1] != a[i]) {
    //                 ans[k++] = a[i];
    //             }
    //             i++;
    //             j++;
    //         }
    //     }

    //     // Remaining elements in a[]
    //     while (i < a.length) {
    //         if (k == 0 || ans[k - 1] != a[i]) {
    //             ans[k++] = a[i];
    //         }
    //         i++;
    //     }

    //     // Remaining elements in b[]
    //     while (j < b.length) {
    //         if (k == 0 || ans[k - 1] != b[j]) {
    //             ans[k++] = b[j];
    //         }
    //         j++;
    //     }

    //     return k; // k is the count of unique elements
    // }
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        return set.size();
    }
}