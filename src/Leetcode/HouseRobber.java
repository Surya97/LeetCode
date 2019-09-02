package Leetcode;

/* Determine the maximum amount money that can be robbed where the only constraint is
 * "The robber can't rob 2 adjacent houses as it alarms police"
 */

public class HouseRobber {
	public int rob(int[] nums) {

		int[] dp = new int[nums.length + 1];

		if (nums.length == 0) {
			return 0;
		}

		if (nums.length == 1) {
			return nums[0];
		}

		dp[1] = nums[0];
		dp[2] = Math.max(dp[1], nums[1]);

		for (int i = 3; i <= nums.length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
		}

		return dp[nums.length];
	}
}
