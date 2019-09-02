package Leetcode;

// Similar to Integer Knapsack problem. (Duplicates allowed)

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		int min = amount + 1;

		for (int i = 1; i <= amount; i++) {
			min = amount + 1;
			for (int j : coins) {
				if (i - j >= 0) {
					min = Math.min(min, 1 + dp[i - j]);
				}
			}
			dp[i] = min;
			// System.out.println(Arrays.toString(dp));
		}
		return dp[amount] > amount ? -1 : dp[amount];

	}
}
