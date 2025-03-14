//https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class UnboundedKnapsack {
    static int knapSack(int val[], int wt[], int w) {
        int n = val.length;
        int[][] t = new int[n+1][w+1];

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < w+1; j++){
                if(i ==0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < w+1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i][j - wt[i-1]], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][w];
    }
}
