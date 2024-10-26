package Cheatsheet;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int res = helper(coins, amount);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public int helper(int[] coins, int amount) {
        // Base cases
        if (amount == 0) return 0; // No coins needed
        if (amount < 0) return Integer.MAX_VALUE; // No solution found

        int minCoins = Integer.MAX_VALUE;


        for (int coin : coins) {
            int res = helper(coins, amount - coin);
            if (res != Integer.MAX_VALUE) {
                minCoins = Math.min(res + 1, minCoins);
            }
        }

        return minCoins;
    }

    public static void main(String[] args) {

    }
}
