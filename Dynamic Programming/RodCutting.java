//https://www.geeksforgeeks.org/problems/rod-cutting0840/1
public class RodCutting {
    public int cutRod(int[] val) {
        int n = val.length;
        int[][] t = new int[n + 1][n + 1];

        // Initialize the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i][j - i], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][n];

    }
}
