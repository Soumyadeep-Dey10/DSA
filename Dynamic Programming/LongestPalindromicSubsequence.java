//https://leetcode.com/problems/longest-palindromic-subsequence/
import java.util.Arrays;
public class LongestPalindromicSubsequence {
    private int[][] t;

    public int longestPalindromeSubseq(String s) {

        String s2 = new StringBuilder(s).reverse().toString();

        int m = s.length();
        int n = s2.length();

        t = new int[m+1][n+1];
        for(int[] row : t){
            Arrays.fill(row, -1);
        }

        return lcs(s, s2, m ,n);
    }
    public int lcs(String str1, String str2, int m, int n){
        for(int i = 0; i < m+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i == 0 || j == 0) t[i][j] = 0;
            }
        }

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(str1.charAt(i -1) == str2.charAt(j - 1)){
                    t[i][j] = 1 + t[i-1][j - 1];
                }
                else {
                    t[i][j]  = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
}
