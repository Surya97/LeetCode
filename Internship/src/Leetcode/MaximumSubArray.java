package Leetcode;

public class MaximumSubArray {
	public int maxSubArray(int[] nums) {
		int max_far = nums[0];
		int curr_max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			curr_max = Math.max(curr_max + nums[i], nums[i]);
			max_far = Math.max(max_far, curr_max);
		}
		return max_far;
	}
}
