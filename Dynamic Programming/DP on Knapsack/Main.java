import java.util.Arrays;

public class Main {
    
    //recursive memoization method with dp
    public static int knapsack(int[] wt, int[] val, int w, int n){
        int[][] t = new int[n+1][w+1];
        
        for(int[] row : t){
            Arrays.fill(row, -1);
        }
        
        if(n == 0 || w == 0) return 0;
        //base condition
        if(t[n][w] != -1) return t[n][w];

        if(wt[n-1] <= w){
            return t[n][w] = Math.max(val[n-1] + knapsack(wt, val, w - wt[n-1], n-1), (knapsack(wt, val, w, n-1))); 
        }
        else{
            return t[n][w] = knapsack(wt, val, w, n-1);
        }
    }
    
    //top-down dp approach(interative approach)
    public static int get(int[] wt, int[] val, int w, int n){
         int[][] t = new int[n+1][w+1];
        
                // Initialize the base case
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        // Fill the table using the bottom-up approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][w];
    }
    public static void main(String[] args) {
        int val[] = {1,2,3};
        int w = 4;
        int[] wt = {4,5,1};
        int n = val.length;
        System.out.println(get(wt, val, w, n));
    }
}
