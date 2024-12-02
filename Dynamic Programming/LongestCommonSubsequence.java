//https://leetcode.com/problems/longest-common-subsequence/
import  java.util.Arrays;
public class LongestCommonSubsequence {
    private int[][] t;

    //recursion without dp
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        t = new int[m + 1][n + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return helper(text1, text2, m, n);
    }
    // public int helper(String text1, String text2, int m, int n){
    //     if(n == 0 || m == 0) return 0;

    //     if(text1.charAt(m-1) == text2.charAt(n-1)){
    //         return 1 + helper(text1, text2, m-1, n-1);
    //     }else{
    //         return Math.max(helper(text1, text2, m-1, n),
    //                (helper(text1, text2, m, n-1)));
    //     }
    // }


    //memoization technique with dp
    //  public int helper(String text1, String text2, int m, int n){

    //     if(n == 0 || m == 0) return 0;
    //     if(t[m][n] != -1) return t[m][n];
    //     if(text1.charAt(m-1) == text2.charAt(n-1)){
    //         return t[m][n] = 1 + helper(text1, text2, m-1, n-1);
    //     }else{
    //         return t[m][n] = Math.max(helper(text1, text2, m-1, n),
    //                (helper(text1, text2, m, n-1)));
    //     }
    // }

    //top-down approach
    public int helper(String text1, String text2, int m, int n){

        for(int i = 0; i < m+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i ==0 || j == 0) t[i][j] = 0;
            }
        }

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }else{
                    t[i][j] = Math.max((t[i-1][j]),
                            (t[i][j-1]));
                }
            }
        }
        return t[m][n];
    }
}
