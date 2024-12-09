//https://leetcode.com/problems/shortest-common-supersequence/
public class PrintSCS {
    private int[][] t;

    public String shortestCommonSupersequence(String a, String b) {
        int m = a.length(), n = b.length();
        t = new int[m + 1][n + 1];

        // Step 1: Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        // Step 2: Traceback to build the SCS
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.append(a.charAt(i - 1)); // Add common character
                i--;
                j--;
            } else if (t[i - 1][j] >= t[i][j - 1]) {
                sb.append(a.charAt(i - 1)); // Add character from `a`
                i--;
            } else {
                sb.append(b.charAt(j - 1)); // Add character from `b`
                j--;
            }
        }

        // Add remaining characters from `a` or `b`
        while (i > 0) {
            sb.append(a.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            sb.append(b.charAt(j - 1));
            j--;
        }

        return sb.reverse().toString();
    }
}
