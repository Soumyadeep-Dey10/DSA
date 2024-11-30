//https://leetcode.com/problems/target-sum/
public class TargetSum {
    public int findTargetSumWays(int[] arr, int target) {
        int total = 0;
        for (int val : arr) {
            total += val;
        }

        // Check if (diff + total) is divisible by 2
        if ((target + total) % 2 != 0 || target > total || (target + total) < 0) {
            return 0;
        }

        int sum = (target + total) / 2;
        return countOfSubsetSum(arr, sum);
    }

    public int countOfSubsetSum(int[] arr, int sum) {
        int n = arr.length;
        int[][] t = new int[n + 1][sum + 1];

        // Initialize the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    t[i][j] = 1;
                } else if (i == 0) {
                    t[i][j] = 0;
                }
            }
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}
