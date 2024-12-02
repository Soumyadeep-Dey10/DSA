//https://www.geeksforgeeks.org/problems/longest-common-substring1452/1
import java.util.Arrays;
public class LongestCommonSubstring {
    private int[][] t;
    public int longestCommonSubstr(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        t = new int[m + 1][n + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return helper(text1, text2, m, n);
    }
    public int helper(String text1, String text2, int m, int n){

        int maxLen = 0;
        for(int i = 0; i < m+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i ==0 || j == 0) t[i][j] = 0;
            }
        }

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    maxLen = Math.max(maxLen, t[i][j]);
                }else{
                    t[i][j] = 0;
                }
            }
        }
        return maxLen;
    }
}
