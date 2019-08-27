package Leetcode;

public class MaxProfit2 {
	public int maxProfit(int[] prices) {
		int i = 0;
		int localmin = 0, localmax = 0;
		int profit = 0;

		while (i < prices.length) {
			while (i < prices.length - 1 && prices[i + 1] < prices[i])
				i++;

			localmin = prices[i];

			while (i < prices.length - 1 && prices[i + 1] > prices[i])
				i++;

			localmax = prices[i];

			profit += localmax - localmin;
			i += 1;
		}

		return profit;
	}
}
