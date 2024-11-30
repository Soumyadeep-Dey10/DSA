//count number of subset with given difference
//https://www.geeksforgeeks.org/problems/partitions-with-given-difference/0
public class SubsetWithGivenDifference {
    int countPartitions(int[] arr, int diff) {
        // Calculate total sum of the array
        int total = 0;
        for (int val : arr) {
            total += val;
        }

        // Check if (diff + total) is divisible by 2
        if ((diff + total) % 2 != 0 || diff > total) {
            return 0;
        }

        int sum = (diff + total) / 2;
        return countOfSubsetSum(arr, sum);
    }

    public int countOfSubsetSum(int[] arr, int sum) {
        int n = arr.length;
        int[][] t = new int[n + 1][sum + 1];

        // Initialize the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    t[i][j] = 1; // There's always one subset (empty subset) for sum = 0
                } else if (i == 0) {
                    t[i][j] = 0; // No subsets can form positive sum with no elements
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
