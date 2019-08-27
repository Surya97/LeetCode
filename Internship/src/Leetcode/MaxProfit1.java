package Leetcode;

public class MaxProfit1 {
	public int maxProfit(int[] prices) {
		if (prices.length == 0 || prices.length == 1) {
			return 0;
		}
		int min = prices[0], maxDiff = prices[1] - prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] - min > maxDiff) {
				maxDiff = prices[i] - min;
			}
			if (min > prices[i]) {
				min = prices[i];
			}
		}
		return maxDiff < 0 ? 0 : maxDiff;
	}
}
