package Leetcode;

import java.util.Arrays;

//use Counting sort for a faster run time.

public class MaximumProductOfThreeNumbers {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int neg = 0, pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				neg++;
			} else {
				pos++;
			}
		}

		if (pos == 0 || neg == 0) {
			return (nums[n - 1] * nums[n - 2] * nums[n - 3]);
		} else {
			return (Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]));
		}
	}
}
