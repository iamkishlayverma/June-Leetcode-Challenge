class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int coinChange[][] = new int[n+1][amount+1];
        int i, j;
        for (i=0; i<=n; i++)
            coinChange[i][0] = 1;
        for (j=1; j<=amount; j++)
            coinChange[0][j] = 0;
        for (i=1; i<=n; i++) {
            for (j=1; j<=amount; j++) {
                coinChange[i][j] = coinChange[i-1][j];
                if (coins[i-1] <= j) 
                    coinChange[i][j] += coinChange[i][j-coins[i-1]];
            }
        }
        return coinChange[n][amount];
    }
}
