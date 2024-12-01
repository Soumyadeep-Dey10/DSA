//https://www.geeksforgeeks.org/problems/coin-change2448/1
public class CoinChange_01 {
    public int count(int coins[], int sum) {
        int n = coins.length;
        int[][] t = new int[n+1][sum+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    t[i][j] = 1; // There's always one subset (empty subset) for sum = 0
                } else if (i == 0) {
                    t[i][j] = 0; // No subsets can form positive sum with no elements
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(coins[i-1] <= j){
                    t[i][j] = t[i][j- coins[i-1]]+ t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
