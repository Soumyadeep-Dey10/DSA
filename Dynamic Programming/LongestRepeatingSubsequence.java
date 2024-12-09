//https://www.geeksforgeeks.org/problems/longest-repeating-subsequence2004/1
public class LongestRepeatingSubsequence {
    private int[][] t;
    public int LongestRepeatingSubsequence(String s) {
        int n = s.length();
        if (n == 0) return 0; // Handle empty string edge case

        // Initialize the DP table
        t = new int[n + 1][n + 1];

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                    t[i][j] = 1 + t[i - 1][j - 1]; // Match and not same index
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]); // No match
                }
            }
        }

        return t[n][n]; // Result is in the last cell
    }
}
