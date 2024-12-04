//https://www.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions0209/1
import java.util.*;
public class ConvertStringAtoB {
    private int[][]t;

    public int minOperations(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        t = new int[m+1][n+1];
        for(int[] row : t){
            Arrays.fill(row, -1);
        }
        int del = m - lcs(s1, s2, m, n);
        int insert = n - lcs(s1, s2, m, n);
        return del + insert;
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
